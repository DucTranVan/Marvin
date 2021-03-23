package com.marvin.core.account.openapi;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.common.OpenApiAdapter;
import com.marvin.shares.api.account.AccountDto;
import com.marvin.shares.api.account.AccountService;
import com.marvin.shares.util.exceptions.InvalidInputException;
import com.marvin.shares.util.exceptions.NotFoundException;
import com.marvin.shares.util.http.ServiceUtil;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;
import reactor.core.publisher.Mono;

import static reactor.core.publisher.Mono.error;


@OpenApiAdapter
@RestController
@RequiredArgsConstructor
public class AccountQueryController implements AccountService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountQueryController.class);

    private final ServiceUtil serviceUtil;

    private  final AccountQuery accountQuery;

    private  final  AccountMapper accountMapper;

    @Override
    public Mono<AccountDto> getAccount(int accountId) {
        LOG.debug("/account return the found account for accountId={}", accountId);

        if (accountId < 1) throw new InvalidInputException("Invalid accountId: " + accountId);

        return accountQuery.getAccount(accountId)
                .switchIfEmpty(error(new NotFoundException("No account found for accountId: " + accountId)))
                .log()
                .map(e -> accountMapper.entityToApi(e))
                .map(e -> {e.setServiceAddress(serviceUtil.getServiceAddress()); return e;});

    }

    @Override
    public Mono<AccountDto> createAccount(AccountDto body) {

        if (body.getAccountId() < 1) throw new InvalidInputException("Invalid accountId: " + body.getAccountId());

        try {

            LOG.debug("createAccount: creates a new account entity for userId: {}", body.getUserId());
            Account accountEntity = accountMapper.apiToEntity(body);
            Mono<AccountDto> newEntity = accountQuery.saveAccount(accountEntity)
                    .log()
                    .onErrorMap(
                            DuplicateKeyException.class,
                            ex -> new InvalidInputException("Duplicate key, Account Id: " + body.getAccountId()))
                    .map(e -> accountMapper.entityToApi(e));

            return newEntity;


        } catch (RuntimeException re) {
            LOG.warn("createAccount failed: {}", re.toString());
            throw re;
        }
    }

    @Override
    public Mono<Void> deleteAccount(int accountId) {
        if (accountId < 1) throw new InvalidInputException("Invalid accountId: " + accountId);

        LOG.debug("deleteAccount: tries to delete an entity with accountId: {}", accountId);
        return accountQuery.deleteAccount(accountId);
    }


}
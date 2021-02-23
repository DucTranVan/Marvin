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


@OpenApiAdapter
@RestController
@RequiredArgsConstructor
public class AccountQueryController implements AccountService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountQueryController.class);

    private final ServiceUtil serviceUtil;

    private  final AccountQuery accountQuery;

    public AccountDto getAccount(int accountId) {
        LOG.debug("/account return the found account for accountId={}", accountId);

        if (accountId < 1) throw new InvalidInputException("Invalid accountId: " + accountId);

        if (accountId == 13) throw new NotFoundException("No account found for accountId: " + accountId);

        Account accountEntity =  accountQuery.getAccount(accountId);
        AccountDto accountDto = new  AccountDto(accountId, serviceUtil.getServiceAddress());
        accountDto.setName(accountEntity.getName());

        return  accountDto;
    }
}
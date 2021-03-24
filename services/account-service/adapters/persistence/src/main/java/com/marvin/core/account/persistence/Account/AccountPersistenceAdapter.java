package com.marvin.core.account.persistence.Account;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.common.PersistenceAdapter;
import com.marvin.shares.api.account.AccountDto;
import com.marvin.shares.api.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@PersistenceAdapter
@RestController
public class AccountPersistenceAdapter implements AccountService {
    private final AccountMongoRepo accountMongoRepo;
    private final AccountQuery accountQuery;
    private final AccountMapper mapper;

    @Autowired
    public AccountPersistenceAdapter(AccountMongoRepo accountMongoRepo,
                                     AccountQuery accountQuery,
                                     AccountMapper mapper
    )
    {
        this.accountMongoRepo = accountMongoRepo;
        this.accountQuery = accountQuery;
        this.mapper = mapper;
    }

    @Override
    public AccountDto getAccount(int accountId) {
        AccountMongoEntity entity = accountMongoRepo.findAccountMongoEntitiesByAccountId(accountId);
        AccountDto accountDto = mapper.entityToApi(entity);
        Account account = accountQuery.getAccount(accountId);
        accountDto.setName(account.getName());

        return accountDto;
    }
}

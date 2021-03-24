package com.marvin.core.account.persistence.Account;

import com.marvin.core.account.common.PersistenceAdapter;
import com.marvin.shares.api.account.AccountDto;
import com.marvin.shares.api.account.AccountService;
import com.marvin.shares.util.exceptions.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@PersistenceAdapter
@RestController
public class AccountPersistenceAdapter implements AccountService {
    private final AccountMongoRepo accountMongoRepo;
    private final AccountMapper mapper;

    @Autowired
    public AccountPersistenceAdapter(AccountMongoRepo accountMongoRepo,
                                     AccountMapper mapper
    )
    {
        this.accountMongoRepo = accountMongoRepo;
        this.mapper = mapper;
    }

    @Override
    public AccountDto getAccount(int accountId) {
        AccountMongoEntity entity = accountMongoRepo.findAccountMongoEntitiesByAccountId(accountId)
                .orElseThrow(() -> new AccountNotFoundException("Account by id" + accountId + "was not found"));
        AccountDto accountDto = mapper.entityToApi(entity);

        return accountDto;
    }
}

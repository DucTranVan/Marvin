package com.marvin.core.account.persistence.mongo;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.port.out.AccountRepository;
import reactor.core.publisher.Mono;


public class AccountPersistence implements AccountRepository {

    private final ReactiveMongoAccountRepository repository;

    public AccountPersistence(final ReactiveMongoAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Account> save(Account account) {
        return this.repository.save(account);
    }


    @Override
    public Mono<Account> findById(int accountId) {
        return this.repository.findByAccountId(accountId);
    }

    @Override
    public Mono<Void> deleteByAccountId(int accountId) {
        return this.repository.deleteByAccountId(accountId);
    }
}

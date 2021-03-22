package com.marvin.core.account.application.service;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.application.port.out.AccountRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class AccountQueryService implements AccountQuery {

    private final AccountRepository accountRepository;


    @Override
    public Mono<Account> getAccount(int accountId) {
        return accountRepository.findById(accountId);
    }

    @Override
    public Mono<Account> saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Void> deleteAccount(int accountId) {
        return accountRepository.deleteByAccountId(accountId);
    }
}

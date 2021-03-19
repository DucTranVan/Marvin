package com.marvin.core.account.application.service;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.domain.account.AccountType;
import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.application.port.out.AccountRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class AccountQueryService implements AccountQuery {

    private final AccountRepository accountRepository;

    @Override
    public Mono<Account> getAccount(String accountId) {

        return accountRepository.findById(accountId);
    }
}

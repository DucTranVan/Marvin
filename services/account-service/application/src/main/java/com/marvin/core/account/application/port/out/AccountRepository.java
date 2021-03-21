package com.marvin.core.account.application.port.out;

import com.marvin.core.account.application.domain.account.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface AccountRepository {

    Mono<Account> save(Account account);

    Mono<Account> findById(int accountId);
}

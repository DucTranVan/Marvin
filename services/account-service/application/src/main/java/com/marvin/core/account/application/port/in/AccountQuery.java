package com.marvin.core.account.application.port.in;

import com.marvin.core.account.application.domain.account.Account;
import reactor.core.publisher.Mono;

public interface AccountQuery {
    public Mono<Account> getAccount(String accountId);
}

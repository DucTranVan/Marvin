package com.marvin.core.account.persistence.mongo;

import com.marvin.core.account.application.domain.account.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface SpringDataAccountRepository extends ReactiveMongoRepository<Account,String> {
    Mono<Account> findByAccountId(int accountId);
}

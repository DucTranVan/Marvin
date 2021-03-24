package com.marvin.core.account.persistence.Account;

import com.marvin.shares.api.account.AccountDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountMongoRepo extends MongoRepository<AccountMongoEntity, String> {
    Optional<AccountMongoEntity> findAccountMongoEntitiesByAccountId(int accountId);
}

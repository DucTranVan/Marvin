package com.marvin.core.account.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMongoRepo extends MongoRepository<TransactionMongoEntity, String> {

}

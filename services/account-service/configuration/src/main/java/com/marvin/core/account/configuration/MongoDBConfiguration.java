package com.marvin.core.account.configuration;

import com.marvin.core.account.persistence.mongo.ReactiveMongoAccountRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories({"com.marvin.core.account.persistence.mongo"})
public class MongoDBConfiguration {
}


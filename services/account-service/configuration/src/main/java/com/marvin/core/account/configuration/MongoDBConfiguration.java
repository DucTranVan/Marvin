package com.marvin.core.account.configuration;

import com.marvin.core.account.persistence.mongo.ReactiveMongoAccountRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories({"com.marvin.core.account.persistence.mongo"})
public class MongoDBConfiguration {
}


package com.marvin.core.account.configuration;

import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.application.port.out.AccountRepository;
import com.marvin.core.account.application.service.AccountQueryService;
import com.marvin.core.account.persistence.mongo.AccountPersistence;
import com.marvin.core.account.persistence.mongo.ReactiveMongoAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BackBoneConfiguration {

    private final  ReactiveMongoAccountRepository reactiveMongoAccountRepository;

    @Autowired
    BackBoneConfiguration(final ReactiveMongoAccountRepository reactiveMongoAccountRepository){
        this.reactiveMongoAccountRepository = reactiveMongoAccountRepository;
    }

    @Bean
    AccountRepository accountRepository() {
        return new AccountPersistence(reactiveMongoAccountRepository);
    }

    @Bean
    AccountQuery accountQuery(final AccountRepository accountRepository){
        return  new AccountQueryService(accountRepository());
    }
}

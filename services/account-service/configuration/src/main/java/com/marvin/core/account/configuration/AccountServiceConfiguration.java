package com.marvin.core.account.configuration;

import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.application.service.AccountQueryService;
import com.marvin.shares.util.http.ServiceUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountServiceConfiguration {

    @Bean
    AccountQuery accountQuery(){
        return  new AccountQueryService();
    }


}
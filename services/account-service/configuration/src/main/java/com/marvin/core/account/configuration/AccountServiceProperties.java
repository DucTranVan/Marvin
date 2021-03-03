package com.marvin.core.account.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "account-service")
public class AccountServiceProperties {

    private String AppName = "Marvin-account-service";

}



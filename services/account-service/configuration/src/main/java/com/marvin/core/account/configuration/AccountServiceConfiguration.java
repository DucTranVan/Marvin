package com.marvin.core.account.configuration;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.port.in.AccountQuery;
import com.marvin.core.account.application.port.out.AccountRepository;
import com.marvin.core.account.application.service.AccountQueryService;
import com.marvin.core.account.persistence.mongo.AccountPersistence;
import com.marvin.core.account.persistence.mongo.SpringDataAccountRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;

import static java.util.Collections.emptyList;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@Configuration
public class AccountServiceConfiguration {

    @Value("${api.common.version}")           String apiVersion;
    @Value("${api.common.title}")             String apiTitle;
    @Value("${api.common.description}")       String apiDescription;
    @Value("${api.common.termsOfServiceUrl}") String apiTermsOfServiceUrl;
    @Value("${api.common.license}")           String apiLicense;
    @Value("${api.common.licenseUrl}")        String apiLicenseUrl;
    @Value("${api.common.contact.name}")      String apiContactName;
    @Value("${api.common.contact.url}")       String apiContactUrl;
    @Value("${api.common.contact.email}")     String apiContactEmail;


    @Bean
    AccountQuery accountQuery(final AccountPersistence accountPersistence){
        return  new AccountQueryService(accountPersistence);
    }


    /**
     * Will exposed on $HOST:$PORT/swagger-ui.html
     *
     * @return
     */
    @Bean
    public Docket apiDocumentation() {

        return new Docket(SWAGGER_2)
                .select()
                .apis(basePackage("com.marvin"))
                .paths(PathSelectors.any())
                .build()
                .globalResponseMessage(POST, emptyList())
                .globalResponseMessage(GET, emptyList())
                .globalResponseMessage(DELETE, emptyList())
                .apiInfo(new ApiInfo(
                        apiTitle,
                        apiDescription,
                        apiVersion,
                        apiTermsOfServiceUrl,
                        new Contact(apiContactName, apiContactUrl, apiContactEmail),
                        apiLicense,
                        apiLicenseUrl,
                        emptyList()
                ));
    }




}
package com.marvin.core.account.configuration;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.domain.account.AccountType;
import com.marvin.core.account.application.domain.transaction.Category;
import com.marvin.core.account.application.domain.transaction.CategoryType;
import com.marvin.core.account.application.domain.transaction.Tag;
import com.marvin.core.account.application.domain.transaction.Transaction;
import com.marvin.core.account.persistence.TransactionMongoRepo;
import com.marvin.shares.util.http.ServiceUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private final TransactionMongoRepo transactionMongoRepo;
    private final ServiceUtil serviceUtil;

    public DbSeeder(TransactionMongoRepo transactionMongoRepo, ServiceUtil serviceUtil) {
        this.transactionMongoRepo = transactionMongoRepo;
        this.serviceUtil = serviceUtil;
    }

    @Override
    public void run(String... strings) throws Exception {
        Transaction trans1 = new Transaction(
                123,
                20000,
                true,
                new Account(
                        "duyle",
                        AccountType.ALL
                ),
                new Category(
                        "mua sam",
                        CategoryType.CUSTOM
                ),
                "le anh duy",
                "Chuyen cho gia thuan",
                Arrays.asList(
                        new Tag(
                                "mua sam"
                        ),
                        new Tag(
                                "gui ban"
                        )
                ),
                new Account(
                        "thuangia",
                        AccountType.ALL
                ),
                this.serviceUtil.getServiceAddress()
        );

        //add our transactions to the database
        List<Transaction> hotels = Arrays.asList(trans1);
//        this.transactionMongoRepo.
    }
}

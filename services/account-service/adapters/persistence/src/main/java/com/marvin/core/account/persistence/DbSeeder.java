package com.marvin.core.account.persistence;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.domain.account.AccountType;
import com.marvin.core.account.application.domain.transaction.Category;
import com.marvin.core.account.application.domain.transaction.CategoryType;
import com.marvin.core.account.application.domain.transaction.Tag;
import com.marvin.core.account.persistence.Account.AccountMongoRepo;
import com.marvin.core.account.persistence.Transaction.TransactionMongoEntity;
import com.marvin.core.account.persistence.Transaction.TransactionMongoRepo;
import com.marvin.shares.util.http.ServiceUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private final TransactionMongoRepo transactionMongoRepo;
    private final AccountMongoRepo accountMongoRepo;
    private final ServiceUtil serviceUtil;

    public DbSeeder(TransactionMongoRepo transactionMongoRepo, AccountMongoRepo accountMongoRepo, ServiceUtil serviceUtil) {
        this.transactionMongoRepo = transactionMongoRepo;
        this.accountMongoRepo = accountMongoRepo;
        this.serviceUtil = serviceUtil;
    }

    @Override
    public void run(String... strings) throws Exception {
        TransactionMongoEntity trans1 = new TransactionMongoEntity(
                20000,
                123,
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

        this.transactionMongoRepo.deleteAll();

        //add our transactions to the database
        List<TransactionMongoEntity> trans = Arrays.asList(trans1);
        this.transactionMongoRepo.saveAll(trans);
    }
}

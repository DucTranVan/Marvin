package com.marvin.core.account.persistence;

import com.marvin.core.account.application.domain.transaction.Transaction;
import com.marvin.shares.api.account.TransactionService;
import com.marvin.shares.util.exceptions.InvalidInputException;
import com.marvin.shares.util.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import static java.util.logging.Level.FINE;

@RestController
public class TransactionPersistenceAdapter implements TransactionService {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionPersistenceAdapter.class);

    private final ServiceUtil serviceUtils;
    private final TransactionMongoRepo transmongoRepo;
    private final TransactionMapper mapper;

    @Autowired
    public TransactionPersistenceAdapter(TransactionMongoRepo transmongoRepo, TransactionMapper mapper, ServiceUtil serviceUtils){
        this.transmongoRepo = transmongoRepo;
        this.mapper = mapper;
        this.serviceUtils = serviceUtils;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        if (transaction.getId() < 1) throw new InvalidInputException("Invalid productId: " + transaction.getId());

        TransactionMongoEntity entity = mapper.apiToEntity(transaction);
        this.transmongoRepo.save(entity);
        LOG.info("Add transaction to database successfully");
    }
}

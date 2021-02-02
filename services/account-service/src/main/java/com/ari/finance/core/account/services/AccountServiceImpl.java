package com.ari.finance.core.account.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.ari.finance.api.core.account.Account;
import com.ari.finance.api.core.account.AccountService;
import com.ari.finance.util.exceptions.InvalidInputException;
import com.ari.finance.util.exceptions.NotFoundException;
import com.ari.finance.util.http.ServiceUtil;

@RestController
public class AccountServiceImpl implements AccountService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class);

    private final ServiceUtil serviceUtil;

    @Autowired
    public AccountServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Account getAccount(int accountId) {
        LOG.debug("/account return the found account for accountId={}", accountId);

        if (accountId < 1) throw new InvalidInputException("Invalid AccountId: " + accountId);

        if (accountId == 13) throw new NotFoundException("No account found for accountId: " + accountId);

        return new Account(accountId, serviceUtil.getServiceAddress());
    }
}
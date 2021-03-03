package com.marvin.core.account.application.service;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.domain.account.AccountType;
import com.marvin.core.account.application.port.in.AccountQuery;

public class AccountQueryService implements AccountQuery {
    @Override
    public Account getAccount(int accountId) {
        return new Account("accountName", AccountType.ALL);
    }
}

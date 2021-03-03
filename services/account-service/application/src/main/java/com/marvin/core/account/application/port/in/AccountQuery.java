package com.marvin.core.account.application.port.in;

import com.marvin.core.account.application.domain.account.Account;

public interface AccountQuery {
    public Account getAccount(int accountId);
}

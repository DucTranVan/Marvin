package com.marvin.core.account.application.domain.account;

import com.marvin.core.account.application.domain.transaction.Category;
import com.marvin.core.account.application.domain.transaction.Transaction;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Account
{
    private String id;

    private String name;

    private AccountType type;

    private String userId;

    Set<Category> categorySet = new HashSet<>();


    public Account(String accountName, AccountType all) {
    }
}

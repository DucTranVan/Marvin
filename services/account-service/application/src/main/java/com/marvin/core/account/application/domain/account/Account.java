package com.marvin.core.account.application.domain.account;

public class Account
{
    private Integer accountId;
    private String name;
    private AccountType type;


    public Account(String name, AccountType type)
    {
        this.name = name;
        this.type = type;
    }

    public Account()
    {
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public AccountType getType()
    {
        return type;
    }

    public void setType(AccountType type)
    {
        this.type = type;
    }
}

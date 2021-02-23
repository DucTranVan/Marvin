package com.marvin.core.account.application.domain.account;

public class Account
{
    private Integer id;
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

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
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

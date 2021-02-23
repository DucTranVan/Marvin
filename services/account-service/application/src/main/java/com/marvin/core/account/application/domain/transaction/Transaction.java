package com.marvin.core.account.application.domain.transaction;


import java.util.ArrayList;
import java.util.List;

import com.marvin.core.account.application.domain.account.Account;


public class Transaction
{
    private Integer id;
    private Integer amount;
    private Boolean isExpenditure;

    private Account account;

    private Category category;

    private String name;

    private String description;

    private List<Tag> tags;

    private Account transferAccount;

    public Transaction()
    {
    }

    public Transaction(Transaction transaction)
    {
        this.id = transaction.getId();
        this.amount = transaction.getAmount();
        this.isExpenditure = transaction.isExpenditure();
        this.account = transaction.getAccount();
        this.category = transaction.getCategory();
        this.name = transaction.getName();
        this.description = transaction.getDescription();
        this.tags = new ArrayList<>(transaction.getTags());
        this.transferAccount = transaction.getTransferAccount();
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }

    public Boolean isExpenditure()
    {
        return isExpenditure;
    }

    public Boolean getExpenditure()
    {
        return isExpenditure;
    }

    public void setIsExpenditure(Boolean expenditure)
    {
        isExpenditure = expenditure;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Tag> getTags()
    {
        return tags;
    }

    public void setTags(List<Tag> tags)
    {
        this.tags = tags;
    }


    public Account getTransferAccount()
    {
        return transferAccount;
    }

    public void setTransferAccount(Account transferAccount)
    {
        this.transferAccount = transferAccount;
    }

    public boolean isTransfer()
    {
        return transferAccount != null;
    }




}

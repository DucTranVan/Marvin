package com.marvin.core.account.application.domain.transaction;


import java.util.ArrayList;
import java.util.List;

import com.marvin.core.account.application.domain.account.Account;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Transaction
{
    private int transID;

    private Integer amount;

    private Boolean isExpenditure;

    private Account account;

    private Category category;

    private String name;

    private String description;

    private List<Tag> tags;

    private Account transferAccount;

    private String serviceAddress;

    public Transaction(int transID,
                       Integer amount,
                       Boolean isExpenditure,
                       Account account,
                       Category category,
                       String name,
                       String description,
                       List<Tag> tags,
                       Account transferAccount,
                       String serviceAddress)
    {
        this.transID = transID;
        this.amount = amount;
        this.isExpenditure = isExpenditure;
        this.account = account;
        this.category = category;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.transferAccount = transferAccount;
        this.serviceAddress = serviceAddress;
    }

    public Integer getId()
    {
        return this.transID;
    }

    public void setId(Integer id)
    {
        this.transID = id;
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

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public boolean isTransfer()
    {
        return transferAccount != null;
    }
}

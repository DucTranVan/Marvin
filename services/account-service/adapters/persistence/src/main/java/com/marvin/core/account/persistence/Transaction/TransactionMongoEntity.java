package com.marvin.core.account.persistence.Transaction;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.core.account.application.domain.transaction.Category;
import com.marvin.core.account.application.domain.transaction.Tag;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Transactions")
public class TransactionMongoEntity {
    @Id
    private String id;

    @Version
    private Integer version;

    @Indexed(direction = IndexDirection.ASCENDING)
    private Integer amount;

    @Indexed(unique = true)
    private int transID;

    private Boolean isExpenditure;

    private Account account;

    private Category category;

    private String name;

    private String description;

    private List<Tag> tags;

    private Account transferAccount;

    public TransactionMongoEntity()
    {

    }

    public TransactionMongoEntity(int transID, Integer amount, Boolean isExpenditure, Account account, Category category, String name, String description, List<Tag> tags, Account transferAccount, String serviceAddress) {
        this.transID = transID;
        this.amount = amount;
        this.isExpenditure = isExpenditure;
        this.account = account;
        this.category = category;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.transferAccount = transferAccount;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
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

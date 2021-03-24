package com.marvin.core.account.persistence.Account;

import com.marvin.shares.api.account.Saving;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "account")
public class AccountMongoEntity {
    @Id
    private String Id;

    @Version
    private Integer version;

    @Indexed(unique = true)
    private int accountId;

    private String name;

    private Date lastSeen;

    private Saving saving;

    private String note;

    private String serviceAddress;

    public AccountMongoEntity(int accountId,
                      String name,
                      Date lastSeen,
                      Saving saving,
                      String note,
                      String serviceAddress
    )
    {
        this.accountId = accountId;
        this.name = name;
        this.lastSeen = lastSeen;
        this.saving = saving;
        this.note = note;
        this.serviceAddress = serviceAddress;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Saving getSaving() {
        return saving;
    }

    public void setSaving(Saving saving) {
        this.saving = saving;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

}


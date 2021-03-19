package com.marvin.core.account.application.domain.transaction;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

import com.marvin.core.account.application.domain.account.Account;
import lombok.Data;


@Data
public class Transaction
{
    private String id;

    private BigDecimal amount;

    private OffsetDateTime date;

    private Account Account;

    private Category category;

    private Set<Tag> tagSet = new HashSet<>();

    private Boolean isExpenditure;

    private String description;



}

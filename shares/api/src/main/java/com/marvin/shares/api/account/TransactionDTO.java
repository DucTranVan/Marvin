package com.marvin.shares.api.account;

import java.util.ArrayList;
import com.marvin.core.account.application.domain.transaction.Category;
import com.marvin.core.account.application.domain.transaction.Tag;
import java.util.List;
import com.marvin.core.account.application.domain.account.Account;
import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO
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

    public Boolean isExpenditure()
    {
        return isExpenditure;
    }

    public boolean isTransfer()
    {
        return transferAccount != null;
    }
}

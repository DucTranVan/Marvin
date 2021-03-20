package com.marvin.shares.api.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccountService {

    /**
     * Sample usage: curl $HOST:$PORT/account/1
     *
     * @param accountId
     * @return the product, if found, else null
     */
    @GetMapping(
            value    = "/account/{accountId}",
            produces = "application/json")
    AccountDto getAccount(@PathVariable int accountId);

}


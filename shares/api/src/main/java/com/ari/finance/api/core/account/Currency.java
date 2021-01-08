package com.ari.finance.api.core.account;

public enum Currency {

    USD, EUR;

    public static Currency getDefault() {
        return EUR;
    }
}

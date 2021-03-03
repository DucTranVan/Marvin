package com.marvin.shares.api.account;

public enum Currency {

    USD, EUR;

    public static Currency getDefault() {
        return EUR;
    }
}

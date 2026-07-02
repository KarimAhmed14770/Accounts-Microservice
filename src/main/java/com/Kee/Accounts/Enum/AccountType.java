package com.Kee.Accounts.Enum;

import lombok.Getter;

@Getter
public enum AccountType {
    SAVING("SAV", "Savings Account"),
    INVESTMENT("INV", "Investment Account"),
    CHECKING("CHK", "Checking Account");

    private final String code;
    private final String description;

    // Constructor must be private
    private AccountType(String code, String description) {
        this.code = code;
        this.description = description;
    }

}

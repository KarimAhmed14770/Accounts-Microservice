package com.Kee.Accounts.dto.Account;

import com.Kee.Accounts.Enum.AccountType;
import com.Kee.Accounts.constants.AccountsConstants;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public record AccountReturnDto (

        @Schema(description = "account id in the bank system",
                example = "1")
        Long accountId,

        @Schema(description = "customer id in the bank system",
                example = "1")
        Long customerId,

        @Schema(description = "account number ", example = "1060736020")
        String accountNumber,

        @Schema(description = "account type ", example = "INVESTMENT",
        allowableValues = {"SAVING", "CHECKING", "INVESTMENT"})
        AccountType accountType,
        @Schema(description = "address of the bank branch that issued the account"
        ,example = AccountsConstants.BRANCH_ADDRESS)
        String branchAddress,

        @Schema(description = "Account Balance")
        BigDecimal balance
        ){
}

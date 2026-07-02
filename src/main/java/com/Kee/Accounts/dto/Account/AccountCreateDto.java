package com.Kee.Accounts.dto.Account;

import com.Kee.Accounts.Enum.AccountType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;


public record AccountCreateDto(
        @NotNull(message = "Customer ID is required")
        @Schema(description = "customer id in the bank system",
                example = "1")
        Long customerId,

        @NotNull(message = "Account type is required")
        @Schema(description = "Account type",
        example = "SAVING",
                allowableValues = {"SAVING", "CHECKING", "INVESTMENT"})
        AccountType accountType
) {}
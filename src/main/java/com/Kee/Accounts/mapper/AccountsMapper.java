package com.Kee.Accounts.mapper;

import com.Kee.Accounts.dto.Account.AccountReturnDto;
import com.Kee.Accounts.entity.Account;

public class AccountsMapper {
    public static AccountReturnDto mapToAccountsDto(Account account) {
      return new AccountReturnDto(account.getAccountId(),
              account.getCustomerId(),
              account.getAccountNumber(),
              account.getAccountType(),
              account.getBranchAddress(),
              account.getBalance());
    }

    public static Account mapToAccount(AccountReturnDto accountDto) {
        return new Account(accountDto.accountId(), accountDto.customerId(), accountDto.accountNumber(), accountDto.accountType(),
                accountDto.branchAddress(),accountDto.balance());
    }
}

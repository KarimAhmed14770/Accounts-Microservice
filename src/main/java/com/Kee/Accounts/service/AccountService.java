package com.Kee.Accounts.service;

import com.Kee.Accounts.dto.Account.AccountCreateDto;
import com.Kee.Accounts.dto.Account.AccountReturnDto;

public interface AccountService {


    AccountReturnDto createAccount(AccountCreateDto accountCreateDto);


    AccountReturnDto fetchAccount(Long customerId);

    //boolean updateAccount(Long customerId, AccountDto accountDto);

    //boolean deleteAccount(Long customerId);
}

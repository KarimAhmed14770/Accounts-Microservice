package com.Kee.Accounts.service.impl;

import com.Kee.Accounts.constants.AccountsConstants;
import com.Kee.Accounts.dto.Account.AccountCreateDto;
import com.Kee.Accounts.dto.Account.AccountReturnDto;
import com.Kee.Accounts.entity.Account;
import com.Kee.Accounts.mapper.AccountsMapper;
import com.Kee.Accounts.repository.AccountRepository;
import com.Kee.Accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    //under development
    @Override
    public AccountReturnDto createAccount(AccountCreateDto accountCreateDto) {
        Account newAccount = new Account();
       /*
       here we will make a call to customer service using feign client
        newAccount.setCustomerId(customer.getCustomerId());*/
        Long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber.toString());
        newAccount.setAccountType(accountCreateDto.accountType());
        newAccount.setBranchAddress(AccountsConstants.BRANCH_ADDRESS);

        accountRepository.save(newAccount);

        return AccountsMapper.mapToAccountsDto(newAccount);
    }

    @Override
    public AccountReturnDto fetchAccount(Long customerId) {
        return null;
    }
/*
    @Override
    public boolean updateAccount(Long customerId, AccountDto accountDto) {
        return false;
    }

    @Override
    public boolean deleteAccount(Long customerId) {
        return false;
    }
    */
}

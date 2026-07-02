package com.Kee.Accounts.repository;

import com.Kee.Accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AccountRepository extends JpaRepository<Account,Long> {
}

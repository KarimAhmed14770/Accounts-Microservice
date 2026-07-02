package com.Kee.Accounts.entity;

import com.Kee.Accounts.Enum.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Table(name="accounts")
public class Account extends BaseEntity{

    @Column(name = "account_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "account_number")
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountType accountType;  // this is better to be an enum

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name="balance")
    private BigDecimal balance;

}

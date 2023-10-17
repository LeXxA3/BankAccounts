package com.example.bankaccounts.repository;

import com.example.bankaccounts.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

    @Modifying
    @Query("update BankAccount account set account.balance = account.balance + ?2 where account.id = ?1")
    void depositMoney(int accountId, int moneyAmount);

    @Modifying
    @Query("update BankAccount account set account.balance = account.balance - ?2 where account.id = ?1")
    void withdrawMoney(int accountId, int moneyAmount);

}

package com.example.bankaccounts.repository;

import com.example.bankaccounts.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

    @Modifying
    @Query("update BankAccount account set account.balance = ?1 where account.id = ?2")
    void modifyBalance(int moneyAmount, int id);

    @Query("select account.balance from BankAccount account where account.id = ?1")
    int getCurrentBalance(int id);

    @Query("select account.pinCode from BankAccount account where account.id = ?1")
    String getPinCode(int id);
}

package com.example.bankaccounts.service;

import com.example.bankaccounts.model.BankAccount;

import java.util.List;

public interface BankAccountService {

    void createAccount(BankAccount account);

    List<BankAccount> getAccounts();

    void authorize(BankAccount account);

    void depositMoney(int amount);

    void withdrawMoney(int amount);

    void transferMoney(int amount);

}

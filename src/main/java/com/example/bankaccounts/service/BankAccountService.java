package com.example.bankaccounts.service;

import com.example.bankaccounts.model.BankAccount;

public interface BankAccountService {

    void createAccount(BankAccount account);

    void authorize(BankAccount account);

    void depositMoney(int amount);

    void withdrawMoney(int amount);

    void transferMoney(int amount);

}

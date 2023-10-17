package com.example.bankaccounts.dao;

import com.example.bankaccounts.model.BankAccount;

import java.util.List;

public interface BankAccountDAO {

    void createAccount(BankAccount bankAccount);

    List<BankAccount> getAccounts();

    void editAccountBalance(int balanceChangeValue);


    void depositMoney(int amount);

    void withdrawMoney(int amount);

    void transferMoney(int amount);
}

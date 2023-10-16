package com.example.bankaccounts.dao;

public interface BankAccountDAO {

    void createAccount(String name, String pinCode);

    void getAllAccounts();

    void editAccountBalance(int balanceChangeValue);


    void depositMoney(int amount);

    void withdrawMoney(int amount);

    void transferMoney(int amount);
}

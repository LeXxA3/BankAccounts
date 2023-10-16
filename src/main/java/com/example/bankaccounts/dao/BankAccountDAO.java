package com.example.bankaccounts.dao;

public interface BankAccountDAO {

    void createAccount(String name, String pinCode);

    void getAllAccounts();

    void editAccountBalance(int balanceChangeValue);
}

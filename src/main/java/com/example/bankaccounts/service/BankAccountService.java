package com.example.bankaccounts.service;

public interface BankAccountService {

    void depositMoney(int amount);

    void withdrawMoney(int amount);

    void transferMoney(int amount);

}

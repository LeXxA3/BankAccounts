package com.example.bankaccounts.service;

import com.example.bankaccounts.model.BankAccount;

import java.util.List;

public interface BankAccountService {

    void createAccount(BankAccount account);

    List<BankAccount> getAccounts();

    BankAccount findAccount(int accountId);


    String getPinCode(int accountId);

    void depositMoney(int accountBalance, int depositAmount, int accountId);

    public void withdrawMoney(int accountBalance, int withdrawAmount, int accountId);

//    void transferMoney(int amount);

}

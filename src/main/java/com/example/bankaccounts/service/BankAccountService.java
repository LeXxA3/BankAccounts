package com.example.bankaccounts.service;

import com.example.bankaccounts.model.BankAccount;

import java.util.List;

public interface BankAccountService {

    void createAccount(BankAccount account);

    List<BankAccount> getAccounts();

    BankAccount findAccount(int accountId);

    void depositMoney(int depositAmount, int accountId);

    public void withdrawMoney(int withdrawAmount, int accountId);

    void transferMoney(int senderAccountId, int receiverAccountId, int transferAmount);

}

package com.example.bankaccounts.service;

import org.springframework.transaction.annotation.Transactional;

public class BankAccountServiceImpl implements BankAccountService {

    @Override
    @Transactional
    public void depositMoney(int amount) {

    }

    @Override
    @Transactional
    public void withdrawMoney(int amount) {

    }

    @Override
    @Transactional
    public void transferMoney(int amount) {

    }
}

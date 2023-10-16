package com.example.bankaccounts.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BankAccountDAOImpl implements BankAccountDAO {

    @Transactional
    @Override
    public void createAccount(String name, String pinCode, int balance) {
        System.out.println(name);
        System.out.println(pinCode);
        System.out.println(balance);
    }

    @Override
    public void getAllAccounts() {

    }

    @Override
    public void editAccountBalance(int balanceChangeValue) {

    }

    @Override
    public void depositMoney(int amount) {

    }

    @Override
    public void withdrawMoney(int amount) {

    }

    @Override
    public void transferMoney(int amount) {

    }
}

package com.example.bankaccounts.service;

import com.example.bankaccounts.dao.BankAccountDAO;
import com.example.bankaccounts.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    private BankAccountDAO bankAccountDAO;

    @Autowired
    public void setBankAccountDAO(BankAccountDAO bankAccountDAO) {
        this.bankAccountDAO = bankAccountDAO;
    }

    @Override
    public void createAccount(BankAccount account) {
        bankAccountDAO.createAccount(account.getName(), account.getPinCode(), account.getBalance());
    }


    @Override
    public void authorize(BankAccount account) {

    }

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

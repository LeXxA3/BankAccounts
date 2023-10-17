package com.example.bankaccounts.service;

import com.example.bankaccounts.dao.BankAccountDAO;
import com.example.bankaccounts.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    private BankAccountDAO bankAccountDAO;

    @Autowired
    public void setBankAccountDAO(BankAccountDAO bankAccountDAO) {
        this.bankAccountDAO = bankAccountDAO;
    }

    @Override
    public void createAccount(BankAccount account) {
        bankAccountDAO.createAccount(account);
    }

    @Override
    public List<BankAccount> getAccounts() {
        return bankAccountDAO.getAccounts();
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

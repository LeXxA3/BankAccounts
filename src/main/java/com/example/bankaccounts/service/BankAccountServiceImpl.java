package com.example.bankaccounts.service;

import com.example.bankaccounts.repository.BankAccountRepository;
import com.example.bankaccounts.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountRepository bankAccountRepository;
    @Autowired
    public void setBankAccountRepository(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    @Transactional
    public void createAccount(BankAccount account) {
        bankAccountRepository.save(account);
    }

    @Override
    public List<BankAccount> getAccounts() {
        return bankAccountRepository.findAll();
    }

    @Override
    public BankAccount findAccount(int id) {
        return bankAccountRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void depositMoney(int accountBalance, int depositAmount, int accountId) {
        bankAccountRepository.modifyBalance(accountBalance+depositAmount, accountId);
    }

    @Override
    @Transactional
    public void withdrawMoney(int accountBalance, int withdrawAmount, int accountId) {
        bankAccountRepository.modifyBalance(accountBalance-withdrawAmount, accountId);

    }


    @Override
    public String getPinCode(int accountId) {
        return bankAccountRepository.getPinCode(accountId);
    }

//    @Override
//    @Transactional
//    public void transferMoney(int amount) {
//    }
}

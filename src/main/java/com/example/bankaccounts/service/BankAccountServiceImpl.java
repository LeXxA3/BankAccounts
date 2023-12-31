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
    @Transactional(readOnly = true)
    public List<BankAccount> getAccounts() {
        return bankAccountRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public BankAccount findAccount(int id) {
        return bankAccountRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void depositMoney(int accountId, int depositAmount) {
        bankAccountRepository.depositMoney(accountId, depositAmount);
    }

    @Override
    @Transactional
    public void withdrawMoney(int accountId, int withdrawAmount) {
        bankAccountRepository.withdrawMoney(accountId, withdrawAmount);

    }

    @Override
    @Transactional
    public void transferMoney(int senderAccountId, int receiverAccountId, int transferAmount) {
        bankAccountRepository.withdrawMoney(senderAccountId, transferAmount);
        bankAccountRepository.depositMoney(receiverAccountId, transferAmount);
    }
}

package com.example.bankaccounts.dao;

import com.example.bankaccounts.model.BankAccount;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BankAccountDAOImpl implements BankAccountDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void createAccount(BankAccount bankAccount) {
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getPinCode());
        System.out.println(bankAccount.getBalance());

        entityManager.persist(bankAccount);
    }

    @Transactional
    @Override
    public List<BankAccount> getAccounts() {
        String jpql = "SELECT b FROM BankAccount b";
        TypedQuery<BankAccount> query = entityManager.createQuery(jpql, BankAccount.class);

        return query.getResultList();
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

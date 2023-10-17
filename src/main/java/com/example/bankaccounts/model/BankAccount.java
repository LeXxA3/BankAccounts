package com.example.bankaccounts.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.Modifying;

@Entity
@Table(name = "accounts")
public class BankAccount {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Size(min = 4, max = 4)
    @Column(name = "pin code")
    private String pinCode;

    @Column(name = "balance")
    private int balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}

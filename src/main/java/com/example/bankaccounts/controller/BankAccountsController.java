package com.example.bankaccounts.controller;

import com.example.bankaccounts.model.BankAccount;
import com.example.bankaccounts.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountsController {

    private BankAccountService bankAccountService;

    @Autowired
    public void setBankAccountService(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/")
    public String displayHomepage() {
        return "homepage";
    }

    @GetMapping("/createAccount")
    public String accountForm() {
        return "createAccount";
    }

    @PostMapping("/createAccount")
    public String createAccount(@ModelAttribute("bankAccount") BankAccount account) {
        bankAccountService.createAccount(account);
        return "redirect:/";
    }

}

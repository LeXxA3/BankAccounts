package com.example.bankaccounts.controller;

import com.example.bankaccounts.model.BankAccount;
import com.example.bankaccounts.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public String createAccount(BankAccount account) {
        bankAccountService.createAccount(account);
        return "redirect:/";
    }

    @GetMapping("/listOfAccounts")
    public ModelAndView accountList() {
        List<BankAccount> accountsList = bankAccountService.getAccounts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("listOfAccounts");
        modelAndView.addObject("accountsList", accountsList);

        return modelAndView;
    }

}

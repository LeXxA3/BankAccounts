package com.example.bankaccounts.controller;

import com.example.bankaccounts.model.BankAccount;
import com.example.bankaccounts.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ModelAndView displayHomepage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("homepage");
        return modelAndView;
    }

    @GetMapping("/createAccount")
    public ModelAndView accountForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("createAccount");
        return modelAndView;
    }

    @PostMapping("/createAccount")
    public ModelAndView createAccount(BankAccount account) {
        ModelAndView modelAndView = new ModelAndView();
        String pin = account.getPinCode();
        if (pin.matches("[0-9]+") && pin.length() == 4) {
            bankAccountService.createAccount(account);
            modelAndView.setViewName("redirect:/");
        } else {
            modelAndView.setViewName("wrongPinFormat");
        }
        return modelAndView;
    }

    @GetMapping("/listOfAccounts")
    public ModelAndView accountList() {
        List<BankAccount> accountsList = bankAccountService.getAccounts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("listOfAccounts");
        modelAndView.addObject("accountsList", accountsList);

        return modelAndView;
    }

    @GetMapping("/deposit")
    public ModelAndView depositMoneyForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("depositMoney");
        return modelAndView;
    }


    @PostMapping("/deposit")
    public ModelAndView depositMoney(String accountIdInput, String depositAmountInput) {
        ModelAndView modelAndView = new ModelAndView();
        int accountId = Integer.parseInt(accountIdInput);
        BankAccount foundAccount = bankAccountService.findAccount(accountId);
        if (foundAccount == null) {
            modelAndView.setViewName("accountNotFound");
        } else {
            int depositAmount = Integer.parseInt(depositAmountInput);
            bankAccountService.depositMoney(accountId, depositAmount);
            modelAndView.setViewName("redirect:/");
        }
        return modelAndView;
    }

    @GetMapping("/withdraw")
    public ModelAndView withdrawMoneyForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("withdrawMoney");
        return modelAndView;
    }

    @PostMapping("/withdraw")
    public ModelAndView withdrawMoney(String accountIdInput, String withdrawAmountInput, String pinInput) {
        ModelAndView modelAndView = new ModelAndView();
        int accountId = Integer.parseInt(accountIdInput);
        BankAccount foundAccount = bankAccountService.findAccount(accountId);
        if (foundAccount == null) {
            modelAndView.setViewName("accountNotFound");
        } else {
            int accountBalance = foundAccount.getBalance();
            int withdrawAmount = Integer.parseInt(withdrawAmountInput);
            if (accountBalance < withdrawAmount) {
                modelAndView.setViewName("notEnoughMoney");
            } else if (!pinInput.equals(foundAccount.getPinCode())) {
                modelAndView.setViewName("incorrectPin");
            } else {
                bankAccountService.withdrawMoney(accountId, withdrawAmount);
                modelAndView.setViewName("redirect:/");
            }
        }
        return modelAndView;
    }

    @GetMapping("/transfer")
    public ModelAndView transferMoneyForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("transferMoney");
        return modelAndView;
    }

    @PostMapping("/transfer")
    public ModelAndView transferMoney(String senderAccountIdInput, String receiverAccountIdInput, String pinInput, String transferAmountInput) {
        ModelAndView modelAndView = new ModelAndView();
        int senderAccountId = Integer.parseInt(senderAccountIdInput);
        int receiverAccountId = Integer.parseInt(receiverAccountIdInput);
        BankAccount senderAccount = bankAccountService.findAccount(senderAccountId);
        BankAccount receiverAccount = bankAccountService.findAccount(receiverAccountId);
        if (senderAccount == null || receiverAccount == null) {
            modelAndView.setViewName("accountNotFound");
        } else {
            int senderAccountBalance = senderAccount.getBalance();
            int transferAmount = Integer.parseInt(transferAmountInput);
            if (!pinInput.equals(senderAccount.getPinCode())) {
                modelAndView.setViewName("incorrectPin");
            } else if (senderAccountBalance < transferAmount) {
                modelAndView.setViewName("notEnoughMoney");
            } else {
                bankAccountService.transferMoney(senderAccountId, receiverAccountId, transferAmount);
                modelAndView.setViewName("redirect:/");
            }
        }
        return modelAndView;
    }

}

package com.BankManagmentSystem.Bank.Managment.System.controller;


import com.BankManagmentSystem.Bank.Managment.System.model.Account;
import com.BankManagmentSystem.Bank.Managment.System.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin(origins = "*") // allows frontend access
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return bankService.createAccount(account);
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return bankService.getAllAccounts();
    }

    @GetMapping("/{accNo}")
    public Account getAccount(@PathVariable String accNo) {
        return bankService.getAccount(accNo);
    }

    @PostMapping("/{accNo}/deposit")
    public Account deposit(@PathVariable String accNo, @RequestParam double amount) {
        return bankService.deposit(accNo, amount);
    }

    @PostMapping("/{accNo}/withdraw")
    public Account withdraw(@PathVariable String accNo, @RequestParam double amount) {
        return bankService.withdraw(accNo, amount);
    }
}

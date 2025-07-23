package com.BankManagmentSystem.Bank.Managment.System.service;

import com.BankManagmentSystem.Bank.Managment.System.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
    public class BankService {
        private Map<String, Account> accounts = new HashMap<>();

        public Account createAccount(Account account) {
            accounts.put(account.getAccountNumber(), account);
            return account;
        }

        public List<Account> getAllAccounts() {
            return new ArrayList<>(accounts.values());
        }

        public Account getAccount(String accountNumber) {
            return accounts.get(accountNumber);
        }

        public Account deposit(String accNo, double amount) {
            Account acc = accounts.get(accNo);
            if (acc != null) {
                acc.setBalance(acc.getBalance() + amount);
            }
            return acc;
        }

        public Account withdraw(String accNo, double amount) {
            Account acc = accounts.get(accNo);
            if (acc != null && acc.getBalance() >= amount) {
                acc.setBalance(acc.getBalance() - amount);
            }
            return acc;
        }
    }

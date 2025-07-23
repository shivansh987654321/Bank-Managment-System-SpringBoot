package com.BankManagmentSystem.Bank.Managment.System.model;

public class Account {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String type; // "savings" or "current"

    public Account() {}

    public Account(String accountNumber, String holderName, double balance, String type) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.type = type;
    }

    // Getters and setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}

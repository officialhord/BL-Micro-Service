package com.offcialhord.accountdetailsservice;

public class Account {

   private String accountName;
   private int accountNumber;
   private int maxTransfer;
   private int accountBalance;

    public Account(String accountName, int accountNumber, int maxTransfer, int accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.maxTransfer = maxTransfer;
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public Account() {
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMaxTransfer() {
        return maxTransfer;
    }

    public void setMaxTransfer(int maxTransfer) {
        this.maxTransfer = maxTransfer;
    }
}

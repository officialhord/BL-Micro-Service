package com.officialhord.accountservice.resources;

public class UserAccounts {

    private int accountnumber;
    private String userId;

    private String userName;

    public UserAccounts(int accountnumber, String userId, String userName) {
        this.accountnumber = accountnumber;
        this.userId = userId;
        this.userName = userName;
    }

    public UserAccounts() {
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

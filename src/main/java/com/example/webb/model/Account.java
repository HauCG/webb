package com.example.webb.model;

public class Account {
    private int Account_Type_Id;
    private int Account_Id;
    private String Account_Name;
    private String Account_Password;

    public Account() {
    }

    public Account(int account_Type_Id, int account_Id, String account_Name, String account_Password) {
        this.Account_Type_Id = account_Type_Id;
        this.Account_Id = account_Id;
        this.Account_Name = account_Name;
        this.Account_Password = account_Password;
    }

    public int getAccount_Type_Id() {
        return Account_Type_Id;
    }

    public void setAccount_Type_Id(int account_Type_Id) {
        Account_Type_Id = account_Type_Id;
    }

    public int getAccount_Id() {
        return Account_Id;
    }

    public void setAccount_Id(int account_Id) {
        Account_Id = account_Id;
    }

    public String getAccount_Name() {
        return Account_Name;
    }

    public void setAccount_Name(String account_Name) {
        Account_Name = account_Name;
    }

    public String getAccount_Password() {
        return Account_Password;
    }

    public void setAccount_Password(String account_Password) {
        Account_Password = account_Password;
    }
}

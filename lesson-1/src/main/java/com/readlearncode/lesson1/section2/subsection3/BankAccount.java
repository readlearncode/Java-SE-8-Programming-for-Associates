package com.readlearncode.lesson1.section2.subsection3;

public class BankAccount {
    private float balance;
    public String name;
    public BankAccount() {}  // Default constructor
    public BankAccount(float initialBalance) {
        balance = initialBalance;
    }
    public BankAccount(String accName) {
        name = accName;
    }
    public void setName(String accName){
        name = accName;
    }
}
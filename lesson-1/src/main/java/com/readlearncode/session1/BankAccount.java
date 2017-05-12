package com.readlearncode.session1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BankAccount {

    int currentBalance;

    public void deposit(int amount){
        currentBalance = currentBalance + amount;
    }

    public void withdraw(int amount){
        currentBalance = currentBalance - amount;
    }



}
package com.readlearncode.lesson1.section1.subsection2;

/**
 * This class defines a Bank Account
 *
 * @author Alex Theedom
 * @version 1.0
 */
public class BankAccount {

    private float balance;

       /**
        * Decrements the account balance by the given amount
        * @param amount the amount withdrawn
        */
    public void withdraw(float amount){
        balance = balance - amount;
    }

}
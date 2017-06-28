package com.readlearncode.lesson2.section1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class if_then_if_else {
    private static BankAccount account;

    public static void main(String... args) {
        int age = 18;
        boolean parentalConsent = true;
        if (age >= 13) {
            account = new BankAccount();
        } else if(parentalConsent){
            account = new BankAccount();
        } else {
            System.out.println("Sorry too young");
        }


        if (age >= 13) {
            account = new BankAccount();
        } else if(age > 20){
            System.out.println("Sorry too young");
        }


        if (age > 200) {
            System.out.println("Sorry too old");
        } else if(age >= 13){
            account = new BankAccount();
        }
    }
}
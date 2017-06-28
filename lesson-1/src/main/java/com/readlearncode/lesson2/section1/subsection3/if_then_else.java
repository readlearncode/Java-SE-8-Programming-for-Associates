package com.readlearncode.lesson2.section1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class if_then_else {
    private static BankAccount account;

    public static void main(String... args) {
        int age = 18;
        if (age >= 13) {
            account = new BankAccount();
        } else {
            System.out.println("Sorry too young");
        }
    }
}
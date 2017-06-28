package com.readlearncode.lesson2.section1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EqualsMethod {

    public static void main(String... args) {

        BankAccount account1 = new BankAccount(12345678);
        BankAccount account2 = new BankAccount(12345678);

        System.out.println(account1 == account2);
        System.out.println(account1.equals(account2));
        "".trim();
    }

}
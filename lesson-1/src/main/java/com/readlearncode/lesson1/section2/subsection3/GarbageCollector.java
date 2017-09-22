package com.readlearncode.lesson1.section2.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class GarbageCollector {

    public GarbageCollector() {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1 = account2;
        BankAccount account3 = account1;
        account2 = null;
    }


}
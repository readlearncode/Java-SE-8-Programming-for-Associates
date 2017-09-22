package com.readlearncode.lesson1.section2.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ObjectLifecycle {

    public void ObjectLifecycle() {
        if (true) {
            BankAccount account = new BankAccount();
            account.withdraw(100);
        }
        // Execute lots more code
    }

}
package readlearncode.section1.subsection3;

import readlearncode.section1.subsection2.*;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class OpenBankAccount2 {

    public static void main(String... args) {
        readlearncode.section1.subsection2.BankAccount account;
        int age = 16;
        if (age >= 18) {
            account = new readlearncode.section1.subsection2.BankAccount();
            System.out.println("Welcome. Your bank account is now open!");
        } else {
            System.out.println("Sorry you're too young!");
        }
    }
}
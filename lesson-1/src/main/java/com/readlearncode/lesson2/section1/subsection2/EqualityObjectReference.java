package com.readlearncode.lesson2.section1.subsection2;


/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class EqualityObjectReference {

    static BankAccount account;

    public static void main(String... args){

        BankAccount ABC = new BankAccount();
        BankAccount XYZ = ABC;
        System.out.println(ABC == XYZ);

//        BankAccount a = new BankAccount();
//        BankAccount b = new BankAccount();
//        System.out.println(a == b);

        System.out.println(account == null);

        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        System.out.println(a.equals(b));

    }

}
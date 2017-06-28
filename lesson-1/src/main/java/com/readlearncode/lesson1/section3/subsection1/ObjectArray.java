package com.readlearncode.lesson1.section3.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ObjectArray {

    public void makeArrays(){

        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount();

        String[] names = new String[5];
        names[0] = "Alex";

    }

    public static void main(String... args){

        new ObjectArray().TestObjectReference();
    }


    public void TestObjectReference(){

        int[] scores = new int[5];
        int[] results = new int[5];
        scores = results;
        System.out.println(scores.equals(results));

        Object[] objects = new Object[5];
        BankAccount[] accounts = new BankAccount[5];
        objects = (Object[])accounts;
        System.out.println(objects.equals(accounts));

        short[] totals = new short[5];
        int[] finals = new int[5];
        // finals = (int)totals;

    }

    public void CastObjectArray1(){
        String[] names = new String[5];
        Object[] objects = names;
        String[] newNames = (String[]) objects;
    }

    public void CastObjectArray2(){
        Object[] names = new String[5];
        String[] newNames = (String[]) names;
    }


}












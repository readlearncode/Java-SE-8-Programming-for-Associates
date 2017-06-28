package com.readlearncode.lesson2.section1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CompoundAssignment {

    public static void main(String... args) {

        int a = 20;
        int b = 10;

        a = a + b;

        System.out.println(a);

        a = 20;
        b = 10;

        a += b;

        System.out.println(a);


        long x = 20;
        int y = 5;
        y = (int) ((long) y + x);

        y += x;

        System.out.println(x = x * 2);

        System.out.println(a = (b = 2));


    }
}
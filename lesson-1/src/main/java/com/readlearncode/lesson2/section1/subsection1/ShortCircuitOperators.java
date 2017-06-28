package com.readlearncode.lesson2.section1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ShortCircuitOperators {

    public static void main(String... args) {

        boolean x = true;
        int a = 10;
        int b = 5;
        System.out.println(x || a > ++b);
        System.out.println(b);


        int count = 0;
        boolean y = true;

        System.out.println(y || addOne(count) > 100);
        System.out.println(count);


    }

    private static int addOne(int count) {
        return ++count;
    }
}
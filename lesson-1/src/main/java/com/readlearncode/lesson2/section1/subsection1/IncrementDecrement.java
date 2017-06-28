package com.readlearncode.lesson2.section1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class IncrementDecrement {

    public static void main(String... args) {

        int visitors = 100;
        System.out.println(visitors++);
        System.out.println(visitors);

//        int x = 10;
//        int y = 10;
//
//        int z = ++x + y--;
//        System.out.println(z);

        int x = 10;
        int y = 10;

        int z = ++x + (y--) + y; // 11 + 10 + 9
        System.out.println(z);

    }
}
package com.readlearncode.lesson2.section1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class StringEquality {

    public static void main(String... args) {

        String message1 = "Hello";
        String message2 = "Hello" + " World";
        System.out.println(message1 == message2);

        String hello1 = new String("Hello");
        String hello2 = "Hello";
        System.out.println(hello1 == hello2);
    }
}
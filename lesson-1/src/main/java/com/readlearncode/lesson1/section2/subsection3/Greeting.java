package com.readlearncode.lesson1.section2.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Greeting {

    {
        System.out.println("1st Instance Initializer");
    }

    public Greeting() {
        System.out.println("Constructor");
    }

    {
        System.out.println("2nd Instance Initializer");
    }

    static {
        System.out.println("Static Initializer");
    }

    public static void main(String... args) {
        new Greeting();
    }
}
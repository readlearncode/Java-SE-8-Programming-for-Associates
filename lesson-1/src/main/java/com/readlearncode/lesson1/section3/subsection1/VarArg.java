package com.readlearncode.lesson1.section3.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class VarArg {

    public static void main(String... args) {
        new VarArg().add(10, 20, 30);
    }

    private void add(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total = total + number;
        }
        System.out.println(total);
    }
}
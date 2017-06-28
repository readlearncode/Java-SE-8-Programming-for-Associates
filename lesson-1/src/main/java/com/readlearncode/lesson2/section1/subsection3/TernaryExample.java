package com.readlearncode.lesson2.section1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class TernaryExample {

    public static void main(String... args) {

        int age = 25;
        String message = age >= 21 ? "Welcome" : "Too Young";

        if (age >= 21) {
            message = "Welcome";
        } else {
            message = "Too Young";
        }

        int score = 100;
        System.out.println(score > 100 ? "You Win" : 0.0f);

        float x = score > 100 ? 400 : 30.50f;

    }

}
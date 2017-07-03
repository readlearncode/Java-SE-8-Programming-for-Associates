package com.readlearncode.lesson2.section2.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class WhileLoop {


    public static void main(String... args) {


        int count = 0;
        while (count < 100) {
            System.out.println(count++);
        }


        while (count < 100)
            System.out.println(count++);
            System.out.println("step");



        while(isAlive()) System.out.println("Johnny 5 is Alive");

        while(isAlive())
            System.out.println("Johnny 5 is Alive");

        while(isAlive())
            // Johny forever
            System.out.println("Johnny 5 is Alive");

        while(isAlive())



            System.out.println("Johnny 5 is Alive");



        while (isAlive()) {
            System.out.println("Johnny 5 is Alive");
        }

        boolean heartbeat = true;
        System.out.println("Johnny 5 is Alive");
        while (heartbeat && count > 10) {
          count--;
        }

    }

    public static boolean isAlive() {
        return true;
    }
}
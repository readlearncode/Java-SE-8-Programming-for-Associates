package com.readlearncode.lesson2.section2.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class DoWhileLoop {

    public static void main(String...args){

        int count = 0;
        do {
            System.out.println(++count);
        } while (false);



        do {System.out.println("Johnny 5 is Alive");} while (isAlive());

        do
            System.out.println("Johnny 5 is Alive");
        while (isAlive());

        do System.out.println("Johnny 5 is Alive"); while (isAlive());

        do  // Johny forever
            System.out.println("Johnny 5 is Alive");
        while (isAlive());

        do

            System.out.println("Johnny 5 is Alive");

        while (isAlive());


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

        do {
            System.out.println("Forever ....");
        } while (true);

    }

    public static boolean isAlive() {
        return true;
    }
}
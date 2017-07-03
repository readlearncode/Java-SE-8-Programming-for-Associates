package com.readlearncode.lesson2.section2.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class InfinateLoop {


    public static void main(String... args) {


        short s = 10;
        byte b = 5;
        while (s > b) {
            System.out.print("forever ... ");
        }

        boolean someCondition = true;
        while (true) {
            if (someCondition) {
                break;
            }
        }


//        final short s = 10;
//        final byte b = 5;
//        while(s<b){
//            // Unreachable Statement
//        }

    }


}
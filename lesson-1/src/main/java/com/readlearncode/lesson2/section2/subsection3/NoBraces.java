package com.readlearncode.lesson2.section2.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NoBraces {

    public static void main(String... args) {

        for (int x = 0; x < 5; x++)
            System.out.println(x);

        for (int x = 0; x < 5; x++)

            System.out.println(x);

        for (int x = 0; x < 5; x++)
            // comments here
            System.out.println(x);

        for (int x = 0; x < 5; x++)
            for (int y = 0; y < 5; y++)
                for (int z = 0; z < 5; z++)
                    System.out.println(x);

    }
}
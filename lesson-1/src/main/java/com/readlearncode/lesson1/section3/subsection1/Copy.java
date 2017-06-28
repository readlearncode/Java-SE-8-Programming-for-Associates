package com.readlearncode.lesson1.section3.subsection1;

import java.util.Arrays;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Copy {

    public static void main(String... args){

        int[] scores = {99, 180, 43, -20};
        int result[] = Arrays.copyOf(scores,2);
        int numbers[] = Arrays.copyOfRange(scores,2, 3);

        System.out.println(result.length);

    }
}
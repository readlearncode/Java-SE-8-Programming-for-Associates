package com.readlearncode.lesson1.section3.subsection1;

import java.util.Arrays;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Search {
    public static void main(String... args){

        int[] scores = {99, 180, 43, -20};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 100);
        System.out.println(index);

    }
}
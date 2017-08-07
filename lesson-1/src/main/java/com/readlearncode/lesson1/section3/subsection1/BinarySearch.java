package com.readlearncode.lesson1.section3.subsection1;

import java.util.Arrays;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BinarySearch {

    public static void main(String... args){

        int[] scores = {20, -100, 2, 0};
        Arrays.sort(scores);
        scores[2] = -10;
        int index = Arrays.binarySearch(scores, -10);
        System.out.println(index);
    }


}
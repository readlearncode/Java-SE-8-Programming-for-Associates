package com.readlearncode.lesson1.section3.subsection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ConvertingLArray {

    public static void main(String... main){

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Zoe");
        names.add("Jane");

        String[] newNames = new String[3];
        names.toArray(newNames);

        List<String> nextNames = Arrays.asList(newNames);


    }

}
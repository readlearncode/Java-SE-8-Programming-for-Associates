package com.readlearncode.lesson1.section3.subsection1;

import java.util.ArrayList;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class UseArrayListExample3 {

    public static void main(String... main){

        ArrayList<String> names = new ArrayList<>(10);
        names.add("Alex");
        names.add("Zoe");
        names.add("Jane");
        names.add(1, "John");
        names.add(5, "Peter");
        System.out.println(names);
    }
}
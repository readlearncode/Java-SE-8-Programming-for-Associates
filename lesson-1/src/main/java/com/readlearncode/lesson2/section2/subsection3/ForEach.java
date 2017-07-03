package com.readlearncode.lesson2.section2.subsection3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ForEach {

    public static void main(String... args) {

        int[] x = new int[]{1, 2, 3, 4, 5};
        for (int y : x) {
            System.out.println(y);
        }

        for(int i = 0 ; i < x.length; i++){
            System.out.println(x[i]);
        }


        ArrayList<String> names = new ArrayList<>();
        names.add("Arjun");
        names.add("Amit");
        names.add("Tanya");
        names.add("Priya");

        for(String name : names){
            System.out.println(name);
        }

        for(Iterator<String> it = names.iterator() ; it.hasNext();){
            String name = it.next();
            System.out.println(name);
        }



//        String aName = "Mo";
//        for(String name : aName){
//            System.out.println(name);
//        }
//
//        String[] letters = new String[]{"A","B","C","D"};
//        for (int letter : letters) {
//            System.out.println(letter);
//        }


    }

}
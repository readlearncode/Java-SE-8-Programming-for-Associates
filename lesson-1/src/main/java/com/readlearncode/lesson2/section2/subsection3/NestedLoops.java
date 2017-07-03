package com.readlearncode.lesson2.section2.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NestedLoops {

    public static void main(String... args) {

        String[][] simpleFlag = new String[][]{
                {"*", "*", "*", "*"},
                {"*", "0", "0", "*"},
                {"*", "0", "0", "*"},
                {"*", "*", "*", "*"}};
        for (int x = 0; x < simpleFlag.length; x++) {
            for (int y = 0; y < simpleFlag.length; y++) {
                System.out.print(simpleFlag[x][y]);
            }
            System.out.println("");
        }

    }
}
package com.readlearncode.lesson2.section2.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Labels {

    public static void main(String...args){

        String[][] simpleFlag = new String[][]{
                {"*", "*", "*", "*"},
                {"*", "0", "0", "*"},
                {"*", "0", "0", "*"},
                {"*", "*", "*", "*"}};
        ROW: for (int x = 0; x < simpleFlag.length; x++) {
            COLUMN: for (int y = 0; y < simpleFlag.length; y++) {
                if(simpleFlag[x][y] == "0") continue ROW;
                System.out.print(simpleFlag[x][y]);
            }
            System.out.println("");
        }



    }
}
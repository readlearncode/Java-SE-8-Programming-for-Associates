package com.readlearncode.lesson1.section2.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PrimitiveWrapper {

    public static void main(String... args){

        Integer score = new Integer(1_000_00);
        byte result = score.byteValue();
        System.out.println(result);

        short lucky = Short.parseShort("777");
        long lotto = Long.parseLong("2311234534");

        Short luck = Short.valueOf("777");
        Long lottery = Long.valueOf("2311234534");

        Double price = new Double("5_300.45");
        String cost = price.toString();

    }

}
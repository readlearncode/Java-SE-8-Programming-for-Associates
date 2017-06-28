package com.readlearncode.lesson2.section1.subsection1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Arithmetic {

    public static void main(String ... args){

        System.out.println(5 + 2 * 10);
        System.out.println(10 + (20-5) * 5);
        System.out.println(40 / 4 + 1 * ((100 / 10) * 2));
        System.out.println(10 + 30 / 2 - 6 * 2);

        // Division results in floor value
        System.out.println(10/3);
        System.out.println(10/6);

        float a = 10/6;
        System.out.println(a);

        BigDecimal x = new BigDecimal(10);
        BigDecimal y = new BigDecimal(6);
        BigDecimal result = x.divide(y, new MathContext(5, RoundingMode.HALF_UP));
        System.out.println(result);

    }

}
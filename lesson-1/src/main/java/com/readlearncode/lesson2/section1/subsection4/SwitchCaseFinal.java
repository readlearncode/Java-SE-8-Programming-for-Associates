package com.readlearncode.lesson2.section1.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SwitchCaseFinal {

    public static void main(String... args) {

        final int malibu = 90265;
        final int hollywood = 90028;
        int zipCode = 90028;
        switch (zipCode) {
            case malibu:
                System.out.println("Malibu");
                break;
            case hollywood:
                System.out.println("Hollywood");
                //break;
            default:
                System.out.println("Unknown");
        }

    }

}
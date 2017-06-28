package com.readlearncode.lesson2.section1.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SwitchCaseMethodCall {

    public static void main(String... args) {

        final int malibu = 90265;
        final int hollywood = 90028;
        switch (getZipCode()) {
            case malibu:
                System.out.println("Malibu");
                break;
            case hollywood:
                System.out.println("Hollywood");
                break;
            default:
        }

    }


    public static int getZipCode() {
        return 90028;
    }

}
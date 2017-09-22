package readlearncode.section1.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SwitchExample3 {

    public static void main(String... args) {

        int zipCode = 90265;

        switch (zipCode) {
            case 90265:
                System.out.println("Malibu");
            case 90028:
                System.out.println("Hollywood");
            default:
                System.out.println("Unknown");
        }

    }
}
package readlearncode.section1.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class SwitchExample2 {

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
                break;
            default:
        }

    }
}
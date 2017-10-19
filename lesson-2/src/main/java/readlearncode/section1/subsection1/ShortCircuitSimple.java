package readlearncode.section1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ShortCircuitSimple {

    public static void main(String... args) {

        boolean x = true;
        int a = 10;
        int b = 5;

        System.out.println(x || a > ++b);
        System.out.println(b);

    }
}
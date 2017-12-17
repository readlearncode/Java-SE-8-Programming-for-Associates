package readlearncode.session2.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AlternativeDoWhileStructures {

    public static void main(String... args) {

        // Single line with braces
        do { System.out.println("Johnny 5 is Alive"); } while (isAlive());

        // Multi-line without braces
        do
            System.out.println("Johnny 5 is Alive");
        while (isAlive());

        // Single-line without braces
        do System.out.println("Johnny 5 is Alive"); while (isAlive());

        // Multi-line without braces and extra lines
        do

            System.out.println("Johnny 5 is Alive");

        while (isAlive());

    }

    private static boolean isAlive() {
        return true;
    }
}
package readlearncode.session2.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AlternativeWhileStructures {

    public static void main(String... args) {

        // Method as the boolean expression
        while (isAlive()) {
            System.out.println("Johnny 5 is Alive");
        }

        // Oneline while statement
        while (isAlive()) System.out.println("Johnny 5 is Alive");

        // While statement without braces
        while (isAlive())
            System.out.println("Johnny 5 is Alive");

        // While statement with comment
        while (isAlive())
            // Johny forever
            System.out.println("Johnny 5 is Alive");

        // While statement with extra lines
        while (isAlive())


            System.out.println("Johnny 5 is Alive");


    }

    private static boolean isAlive() {
        return true;
    }
}
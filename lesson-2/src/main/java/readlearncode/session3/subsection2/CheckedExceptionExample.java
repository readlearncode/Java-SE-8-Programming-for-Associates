package readlearncode.session3.subsection2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CheckedExceptionExample {

    public static void main(String... args) {

        try {
            new FileReader("DoesNotExist.txt");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // Execution flow continue here

    }

}
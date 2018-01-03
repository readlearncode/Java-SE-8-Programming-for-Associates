package readlearncode.session3.subsection2;

import java.io.FileReader;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ExceptionInformationExample {

    public static void main(String... args) {

        try {
            new FileReader("DoesNotExist.txt");
        } catch (IOException ex) {
            System.out.println("The exception");
            System.out.println(ex);
            System.out.println("The exception message");
            System.out.println(ex.getMessage());
            System.out.println("The exception stack trace");
            ex.printStackTrace();
        }

    }

}
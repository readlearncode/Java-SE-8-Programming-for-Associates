package readlearncode.session3.subsection3;

import readlearncode.session3.subsection3.exceptions.ConnectionException;
import readlearncode.session3.subsection3.exceptions.DatabaseConnectionException;

import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ParentCatchesChildExceptionExample {

    public static void main(String... args) {

        try {
            throw new DatabaseConnectionException();
        } catch (ConnectionException ex) {
            System.out.println("Connection Failed");
        }

    }

}
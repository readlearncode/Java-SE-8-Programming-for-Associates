package readlearncode.session3.subsection3;

import readlearncode.session3.subsection3.exceptions.ConnectionException;
import readlearncode.session3.subsection3.exceptions.DatabaseConnectionException;
import readlearncode.session3.subsection3.exceptions.InternetConnectionException;

import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class MultipleCatchesExample {

    public static void main(String... args) {
        try {
            connect();
        } catch (DatabaseConnectionException ex) {
            System.out.println("Database Connection Failed");
        } catch (ConnectionException ex) {
            System.out.println("Connection Failed");
        }
    }

    private static void connect() throws ConnectionException {
        if (new Random().nextInt(10) % 2 == 0) {
            System.out.println("throw ConnectionException");
            throw new ConnectionException();
        } else {
            if (new Random().nextInt(10) % 2 == 0) {
                System.out.println("throw InternetConnectionException");
                throw new InternetConnectionException();
            } else {
                System.out.println("throw DatabaseConnectionException");
                throw new DatabaseConnectionException();
            }
        }
    }

}
package readlearncode.session3.subsection3;

import readlearncode.session3.subsection3.exceptions.ConnectionException;

import java.io.IOException;
import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class UseCustomExceptions {

    public static void main(String... args) {

        try {
            connect();
        } catch (ConnectionException ex) {
            System.out.println("Connection Failed");
        }

    }

    private static void connect() throws ConnectionException {
        if (new Random().nextInt(10) % 2 == 0) throw new ConnectionException();
    }

}
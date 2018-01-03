package readlearncode.session3.subsection3;

import readlearncode.session3.subsection3.exceptions.ConnectionException;

import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RuntimeExceptionExample {

    public static void main(String... args) {
        connect();
    }

    private static void connect() {
        throw new RuntimeException();
        // OR throw new Error();
    }
}
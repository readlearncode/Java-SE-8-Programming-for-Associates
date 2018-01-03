package readlearncode.session3.subsection2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class FinallyBlockExample {

    public static void main(String... args) {

        String result = "";
        for (int i = 0; i < 10; i++) {
            try {
                retrieveLiveData();
                result = "Live Data";
            } catch (IOException ex) {
                result = "Cached Data";
            } finally {
                System.out.println("Processing: " + result);
            }
        }

    }

    /**
     * Connect to external system
     */
    public static void retrieveLiveData() throws IOException {
        if (new Random().nextInt(10) % 2 == 0) throw new IOException();
    }

}
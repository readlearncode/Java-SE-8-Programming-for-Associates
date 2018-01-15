package readlearncode.session1.subsection6;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PassByValueAddElement {

    public static void main(String... args) {
        String message = "Hello";
        newMessage(message);
        System.out.println(message);
    }

    public static void newMessage(String message) {
        message = new String("Hello World");
    }
}
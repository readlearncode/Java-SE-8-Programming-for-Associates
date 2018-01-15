package readlearncode.session1.subsection6;

import static readlearncode.session1.subsection6.PassByValue.changeAge;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PassByValueObjectReference {

    public static void main(String... args) {
        String[] messages = new String[]{"Hello"};
        newMessage(messages);
        System.out.print(messages[0]);
    }

    public static void newMessage(String[] message) {
        message[0] = "Hello World";
    }
}
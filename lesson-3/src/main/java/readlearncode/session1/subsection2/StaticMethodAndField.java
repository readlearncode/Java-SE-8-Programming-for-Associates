package readlearncode.session1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class StaticMethodAndField {

    public static int count = 0;

    public static void main(String... args) {
        // Via a class reference
        System.out.println("Count: " + StaticMethodAndField.count);

        // Via an instance reference
        StaticMethodAndField instanceRef = new StaticMethodAndField();
        System.out.println("Count: " + instanceRef.count);
    }

}
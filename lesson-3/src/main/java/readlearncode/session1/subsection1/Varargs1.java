package readlearncode.session1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Varargs1 {

    public static void calculate(String message, int... numbers) {
        System.out.println(message);
    }

    public static void main(String... args) {
        calculate("Hello World");
        calculate("Hello World", 100);
        calculate("Hello World", 100, 200);
        calculate("Hello World", 100, 200, 300);
        calculate("Hello World", new int[]{1, 2, 3});
    }
}
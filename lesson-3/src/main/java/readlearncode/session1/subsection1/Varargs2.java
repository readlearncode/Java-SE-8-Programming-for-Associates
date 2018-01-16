package readlearncode.session1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Varargs2 {

    public static void calculate(String message, int... numbers) {
        System.out.println(numbers.length);
        System.out.println(numbers[1]);
    }

    public static void main(String... args) {
        calculate("Hello World", new int[]{1, 2, 3});
    }
}
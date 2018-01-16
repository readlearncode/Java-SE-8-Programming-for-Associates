package readlearncode.session1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Varargs3 {

    public static void calculate(String message, int... numbers) {
        System.out.println(numbers.length);
    }

    public static void main(String... args) {

        // The numbers array will be zero length
        calculate("Hello World");

        // The numbers array will be 1
        calculate("Hello World", 100);

        // The numbers array will be 2
        calculate("Hello World", 100, 200);

        // The numbers array will be 3
        calculate("Hello World", 100, 200, 300);

        //The numbers array will be 3
        calculate("Hello World", new int[]{1, 2, 3});
    }
}
package readlearncode.session1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Counter {

    public static int counter = 0;

    public static void main(String... args) {

        Counter.count();
        // instance 1
        System.out.println(new Counter().counter);

        Counter.count();
        // instance 2
        System.out.println(new Counter().counter);

        Counter.count();
        // instance 3
        System.out.println(new Counter().counter);

    }

    public static void count() {
       ++counter;
    }

}
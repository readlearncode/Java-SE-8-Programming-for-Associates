package readlearncode.session1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class StaticInitializer {

    public static int count = 0;

    static {
        ++count;
        System.out.println("First use");
    }

    public static void main(String... args) {
        System.out.println(StaticInitializer.count);
        System.out.println(StaticInitializer.count);
        System.out.println(StaticInitializer.count);
    }
}
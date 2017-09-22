package readlearncode.section1.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ShortCircuitMethodCall {

    public static void main(String...args){

        int counter = 0;
        boolean y = true;
        System.out.println(y || addOne(counter) > 100);
        System.out.println(counter);

    }

    private static int addOne(int counter) {
        return ++counter;
    }

}
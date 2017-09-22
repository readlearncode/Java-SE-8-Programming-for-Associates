package readlearncode.section1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class TernaryOperator1 {

    public static void main(String... args) {

        // the ternary operator
        int age = 18;
        String message = age >= 21 ? "Welcome" : "Too Young";
        System.out.println(message);

        // the equivalent if-then-else statement:
        if(age >= 21){
            message = "Welcome";
        } else {
            message = "Too Young";
        }
        System.out.println(message);

    }

}
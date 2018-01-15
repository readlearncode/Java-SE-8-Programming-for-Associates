package readlearncode.session1.subsection6;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PassByValue {

    public static void main(String... args) {
        short age = 20;
        changeAge(age);
        System.out.println(age);
    }

    public static void changeAge(long age) {
        age = 21;
    }

}
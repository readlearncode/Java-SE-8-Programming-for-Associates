package readlearncode.section1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class TernaryOperator2 {

    public static void main(String... args) {

        // the ternary operator
        int score = 50;
        System.out.println( score > 100 ? "You Win" : 0.0f);
        // float result = score > 100 ? "You Win" : 0.0f;

        System.out.println(score > 100 ? a() : b());

    }

    private static String b() {
        return "You Lose";
    }

    private static String a() {
        return "You Win";
    }

}
package readlearncode.session3.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class TrickyFinallyExample {

    public static void main(String... args) {
        System.out.println(calculateScore());
    }

    private static int calculateScore() {

        int score = 100;
        try {
            score++;
            return score++;
        } catch (Exception ex) {
            score = score + 1;
            return score;
        } finally {
            --score;
        }

    }
}
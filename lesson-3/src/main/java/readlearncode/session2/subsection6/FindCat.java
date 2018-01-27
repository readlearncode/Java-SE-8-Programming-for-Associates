package readlearncode.session2.subsection6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class FindCat {

    public static void main(String... args) {

        List<Cat> cats = new ArrayList();
        cats.add(new Tiger());
        cats.add(new Cougar());

        perform(cats, cat -> cat.isStriped());
    }

    public static void perform(List<Cat> cats, Predicate<Cat> search) {

        for (Cat cat : cats) {
            System.out.println(cat.type() + " is stripped: " + search.test(cat));
        }

    }

}
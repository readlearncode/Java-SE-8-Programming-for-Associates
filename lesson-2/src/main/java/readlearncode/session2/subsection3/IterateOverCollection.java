package readlearncode.session2.subsection3;

import java.util.ArrayList;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class IterateOverCollection {

    public static void main(String... args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Arjun");
        names.add("Amit");
        names.add("Tanya");
        names.add("Priya");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
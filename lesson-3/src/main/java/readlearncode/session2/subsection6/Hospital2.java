package readlearncode.session2.subsection6;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Hospital2 {

    interface Operation {
        void perform(Cat cat);
    }

    void operate(Cat cat, Operation operation) {
        operation.perform(cat);
    }

    public static void main(String... args) {

        Operation bandage = (Cat cat) -> System.out.println("Bandage the " + cat.type());
        Operation heart = (Cat cat) -> System.out.println("Heart transplant for the " + cat.type());

        Hospital2 hospital = new Hospital2();
        hospital.operate(new Tiger(), bandage);
        hospital.operate(new Cougar(), heart);

    }

}
package readlearncode.session2.casting;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Lion implements Cat {

    public void sleeps() {
        System.out.println("The lion sleeps");
    }

    public static void main(String... args) {

        Cat cat = new Lion();
        cat.breath();

        Lion lion = new Lion();
        lion.breath();
        lion.sleeps();

        Lion catToLion = (Lion)cat;
        catToLion.sleeps();

//        Lion castLion = cat;

    }
}
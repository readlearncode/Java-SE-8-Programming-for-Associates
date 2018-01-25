package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Zoo {

    public void vetVisit(Cat cat) {
        cat.roar();
    }

    public static void main(String... args) {
        Zoo zoo = new Zoo();

        Tiger tiger = new Tiger();
        DomesticCat domesticCat = new DomesticCat();
        Cougar cougar = new Cougar();

        zoo.vetVisit(tiger);
        zoo.vetVisit(domesticCat);
        zoo.vetVisit(cougar);
    }

}
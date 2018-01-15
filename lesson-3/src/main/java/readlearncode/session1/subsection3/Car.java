package readlearncode.session1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Car {

    private String make;
    private String colour;
    private int speed;

    Car() {
        this("DeLorean", "Silver");
    }

    Car(String make, String colour) {
        this("DeLorean", "Silver", 88);
    }

    Car(String make, String colour, int speed) {
        this.make = make;
        this.colour = colour;
        this.speed = speed;
    }

}
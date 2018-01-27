package readlearncode.session2.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract class Panthera implements Cat {

    public String lifeStyle = "Nocturnal";

    private int speed = 45;

    protected abstract void hunt();

    public void roar() {
        System.out.println("Roars");
    }

}

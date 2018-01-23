package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract class Panthera implements Cat {

    public String lifeStyle = "Nocturnal";

    private int speed = 45;

    public int getPantheraSpeed(){
        return speed;
    }

    protected abstract void hunt();

    public void roar(){
        System.out.println("Roars");
    }

}
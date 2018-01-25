package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Leopard extends Panthera {

    public String lifeStyle = "Dusk";

    protected void hunt() {
        System.out.println("Hunt on its own");
    }

    public void printLifeStyle() {
        System.out.println("Leopard is " + super.lifeStyle);
    }

    public void roar(){
        super.roar();
        System.out.println("Roars very loudly");
    }

    public static void main(String... arg) {
        new Leopard().printLifeStyle();
        new Leopard().roar();
    }

}
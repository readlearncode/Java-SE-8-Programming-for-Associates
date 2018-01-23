package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Tiger extends Panthera {

    private int speed = 20;

    public int getTigerSpeed(){
        return speed;
    }

    protected void hunt() {
        System.out.println("Hunt in packs ");
    }

    public static void main(String... args) {
        Tiger tiger = new Tiger();
        String lifestyle = tiger.lifeStyle;
        System.out.println("The tiger's lifestyle is: " + lifestyle);
//        System.out.println("The tiger's speed is: " + speed);
        tiger.hunt();
        tiger.roar();
    }

}
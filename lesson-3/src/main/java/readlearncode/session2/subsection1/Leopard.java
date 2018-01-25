package readlearncode.session2.subsection1;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Leopard extends Panthera {

    public void roar(){
//        super.roar();
        System.out.println("Roars very loudly");
    }

    public static void main(String... arg) {
        new Leopard().roar();
    }

}
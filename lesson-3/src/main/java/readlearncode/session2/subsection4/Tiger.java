package readlearncode.session2.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Tiger extends Panthera {

    private int speed = 20;

    public String getFurMarkings() {
        return "Striped";
    }

    protected void hunt() {
        System.out.println("Hunt in packs ");
    }


}

package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract class Felis implements Cat {

    public String lifeStyle = "Day-time";
    private String colour;

    public Felis(String colour) {
        this.colour = colour;
    }

    public void plays(){
        // moggy plays
    }

    public String getColour() {
        return colour;
    }
}
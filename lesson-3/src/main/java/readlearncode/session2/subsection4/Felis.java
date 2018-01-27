package readlearncode.session2.subsection4;

import readlearncode.session2.cats.Cat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract class Felis implements Cat {

    private String colour;

    public Felis(String colour) {
        this.colour = colour;
    }

    public void roar() {
        System.out.println("Roars");
    }

}
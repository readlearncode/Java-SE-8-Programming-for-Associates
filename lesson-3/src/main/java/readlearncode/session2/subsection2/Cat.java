package readlearncode.session2.subsection2;

import readlearncode.session2.cats.Animal;
import readlearncode.session2.cats.Mammal;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract interface Cat extends Mammal, Animal {

    static int legs = 4;

    public default void breath() {
        System.out.println("Cat is breathing!");
    }

    public abstract void roar();

}

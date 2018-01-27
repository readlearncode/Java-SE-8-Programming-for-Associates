package readlearncode.session2.subsection4;

import readlearncode.session2.cats.Animal;
import readlearncode.session2.cats.Mammal;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract interface Cat {

    public default void breath() {
        System.out.println("Cat is breathing!");
    }

    public abstract void roar();

}


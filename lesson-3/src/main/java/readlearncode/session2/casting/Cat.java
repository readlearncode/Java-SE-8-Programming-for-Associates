package readlearncode.session2.casting;

import readlearncode.session2.cats.Animal;
import readlearncode.session2.cats.Mammal;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
interface Cat {

    default void breath() {
        System.out.println("Cat is breathing!");
    }

}

package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract interface Cat extends Mammal, Animal {

    static void walk() {
        System.out.println("Cat is walking!");
    }

    static int legs = 4;

    public default void breath() {
        System.out.println("Cat is breathing!");
    }

    public abstract void roar();

}

package readlearncode.session2.subsection4;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CatAccess {

    // Use Tiger reference
    {
        Tiger tiger = new Tiger();

        // From Tiger
        tiger.getFurMarkings();

        // From Panthera
        tiger.hunt();

        // From Cat
        tiger.breath();
        tiger.roar();
    }

    // Use Panthera reference
    {
        Tiger tiger = new Tiger();
        Panthera panthera = tiger;

        // From Tiger
        // Nothing is accessible from Tiger

        // From Panthera
        panthera.hunt();

        // From Cat
        panthera.breath();
        panthera.roar();
    }

    // Use Cat reference
    {
        Tiger tiger = new Tiger();
        Cat cat = tiger;

        // From Tiger
        // Nothing is accessible from Tiger

        // From Panthera
        // Nothing is accessible from Tiger

        // From Cat
        cat.breath();
        cat.roar();
    }
}
package readlearncode.session2.subsection5;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Access {

    {
        Cat cat = new Lion();
        cat.breath();

        Lion lion = new Lion();
        lion.breath();
        lion.sleeps();

        Lion catToLion = (Lion)cat;
        catToLion.sleeps();

    }

}
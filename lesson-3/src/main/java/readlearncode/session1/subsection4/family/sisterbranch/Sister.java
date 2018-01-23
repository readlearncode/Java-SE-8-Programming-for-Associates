package readlearncode.session1.subsection4.family.sisterbranch;

import readlearncode.session1.subsection4.family.Grandparents;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Sister extends Grandparents {

    private void eat(){
        // eat some food
    }

    void feedChild(){
        // feed child
    }

    public static void main(String...args){
        new Sister().eat();
        new Child().tidyToys();
    }
}
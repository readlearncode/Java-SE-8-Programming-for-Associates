package readlearncode.session1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Varargs {

    public Varargs(String...names){}

    public static void main(String...args){
        new Varargs();
        new Varargs("John");
        new Varargs("Li", "Raj");
        new Varargs("Carly", "Jane", "Priya");
    }
}
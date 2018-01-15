package readlearncode.session1.subsection2;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class StaticMethod {

    public static void main(String...args){
        // Via a class reference
        StaticMethod.count();

        // Via an instance reference
        StaticMethod instanceRef = new StaticMethod();
        instanceRef.count();
    }

    public static void count(){
        System.out.println("Count");
    }

}
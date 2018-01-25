package readlearncode.session2.lambdas;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Hospital1 {

    interface Operation {
        void perform();
    }

    void operate(Operation operation) {
        operation.perform();
    }

    public static void main(String... args){

        Operation bandage = () -> System.out.println("Bandage leg");
        Operation heart = () -> System.out.println("Perform heart transplant");

        Hospital1 hospital = new Hospital1();
        hospital.operate(bandage);
        hospital.operate(heart);
    }

}
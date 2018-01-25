package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Cougar extends Puma {

    public  String type(){
        return "Cougar";
    }

    public void printChildType() {
        System.out.println("Child type is: " + type());
    }

    public static void main(String... args){
        Cougar cougar = new Cougar();
        cougar.printChildType();
        cougar.printParentType();
    }

    public Cougar(){
        super("Black");
    }

    public void roar(){
        System.out.println("Roars");
    }

    public void eat(){}
    public boolean eat(String food){ return true;}
    public void eat(int calories){}
    public void eat(long calories){}

    public void eat(Integer calories){}
    public void eat(Leopard leopard, float calories){}
    public String eat(boolean hungry){ return "Eaten";}
    public void eat(Leopard leopard){}
    public void eat(Panthera panthera){}
    public void eat(Cat cat){}


}
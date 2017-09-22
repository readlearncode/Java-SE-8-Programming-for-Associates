package readlearncode.section1.subsection3;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class OpenBankAccount2 {

    public static void main(String... args) {

        int age = 18; // Let's assume age is 18 years old

        BankAccount account = new BankAccount();

        if (age >= 13) {
            account = new BankAccount();
            System.out.println("Thank you for opening an account with us.");
        } else {
            System.out.println("Sorry you're too young to open an account");
        }


    }
}

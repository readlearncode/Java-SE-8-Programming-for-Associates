package readlearncode.section1.subsection3;

import java.util.Objects;

/**
 * This class defines a Bank Account
 *
 * @author Alex Theedom
 * @version 1.0
 */
public class BankAccount {

    private float balance;
    private int accountNumber;

    public BankAccount() {}

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Decrements the account balance by the given amount
     *
     * @param amount the amount withdrawn
     */
    public void withdraw(float amount) {
        balance = balance - amount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
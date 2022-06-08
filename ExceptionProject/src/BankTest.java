import bankexception.InsufficientBalanceException;
import bankexception.InvalidNameException;
import bankexception.NegativeAccountNumberException;
import bankexception.OpeningBalanceException;
import bankexception.PANCardException;

public class BankTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        BankAccount account = null;
        try {
            System.out.println("-------------code Started ------------");

            account = new BankAccount(-1, 100, "Sudmit");
        } catch (OpeningBalanceException e) {
            e.printStackTrace();
        } catch (InvalidNameException e) {
            e.printStackTrace();
        } catch (NegativeAccountNumberException e) {
            e.printStackTrace();
        } finally {

        }

        try {
            // System.out.println(account.withdraw(300));
            System.out.println(account.withdraw(500000));

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-------------code Ends ------------");

    }

}

class BankAccount {

    private int accountNumber;
    private int balance;
    private String name;

    public BankAccount(int accountNumber, int balance, String name)
            throws InvalidNameException, OpeningBalanceException, NegativeAccountNumberException {

        if (accountNumber < 1)
            throw new NegativeAccountNumberException("Account Number should be positive");
        if (balance < 100)
            throw new OpeningBalanceException("Opening Balance Should be Minimum 100");

        if (name.length() < 5)
            throw new InvalidNameException("Name should be at least 5 characters");
        this.balance = balance;
        this.name = name;

        System.out.println("account successfully created");
    }

    public String withdraw(int amount) {

        if (this.balance < amount)
            throw new InsufficientBalanceException("insuffcient Balance Exception");

        if (amount > 50000)
            throw new PANCardException("Pan card required for amount above 50l");
        return "Amount withdrawl successful";
    }

}
public class SyncTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        BankAccount ba = new BankAccount(101, "Ram", 5000);
        Teller t1 = new Teller("Vinay", 1000, ba);
        Teller t2 = new Teller("\tnandish", 2000, ba);
        Teller t3 = new Teller("\t\tVishal", 3000, ba);

        t1.start();
        t2.start();
        t3.start();

    }

}

class Teller extends Thread {
    String tellerName;
    double cashToDeposit;
    BankAccount bankAccount;

    public Teller(String tellerName, double cashToDeposit, BankAccount bankAccount) {
        this.tellerName = tellerName;
        this.cashToDeposit = cashToDeposit;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {

       bankAccount.deposit(tellerName, cashToDeposit);
    }

}

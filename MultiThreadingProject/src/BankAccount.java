public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    
    /** 
     * @return double
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    
    /** 
     * @param accountBalance
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    
    /** 
     * @param amountToWithdraw
     */
    void withdraw(double amountToWithdraw) {

        System.out.println("Withdrawing..." + amountToWithdraw);
        this.accountBalance = accountBalance - amountToWithdraw;

    }

    
    /** 
     * @param tellername
     * @param amountToDeposit
     */
    void deposit(String tellername, double amountToDeposit) {


        System.out.println(tellername+"Line......1111111");
        System.out.println(tellername+"Line......22222222");
        System.out.println(tellername+"Line......33333333");


        synchronized(this){
        
            System.out.println(tellername+" reading balance");
        double curbal = this.getAccountBalance();
        System.out.println(tellername+ " current bal "+curbal);
        System.out.println(tellername+" calculating new balance");
        double newbal = curbal+amountToDeposit;
        System.out.println(tellername+newbal);

        System.out.println(tellername+ "updating balance");

        this.setAccountBalance(newbal);
        
        System.out.println(tellername+ " deposit complete");

        System.out.println(tellername+" final balance is "+this.getAccountBalance());
        }


        
        System.out.println(tellername+"Line......44444444");
        System.out.println(tellername+"Line......55555555");
        System.out.println(tellername+"Line......66666666");
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
                + accountBalance + "]";
    }

}
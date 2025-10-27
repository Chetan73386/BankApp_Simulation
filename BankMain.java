public class BankMain {
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount("Chetan Patil", 5000, 5.0);
        CurrentAccount ca = new CurrentAccount("Tech Solutions Pvt Ltd", 10000, 5000);

        
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.addInterest();
        sa.showBalance();
        sa.printTransactionHistory();

        System.out.println("\n-----------------------------\n");

        ca.deposit(3000);
        ca.withdraw(12000); 
        ca.showBalance();
        ca.printTransactionHistory();
    }
}

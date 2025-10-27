public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal denied! Insufficient balance in savings account.");
        } else {
            super.withdraw(amount);
        }
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        transactionHistory.add("Interest added: " + interest + " | New Balance: " + balance);
    }
}

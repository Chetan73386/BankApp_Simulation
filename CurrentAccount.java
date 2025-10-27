public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount + " (Overdraft allowed) | New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}

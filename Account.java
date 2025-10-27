import java.util.ArrayList;

public class Account {
    protected String accountHolder;
    protected double balance;
    protected ArrayList<String> transactionHistory;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created for " + accountHolder + " with balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            transactionHistory.add("Attempted withdrawal failed due to insufficient funds.");
            System.out.println("Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void printTransactionHistory() {
        System.out.println("\n--- Transaction History for " + accountHolder + " ---");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }
}

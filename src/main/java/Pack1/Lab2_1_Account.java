package Pack1;

public class Lab2_1_Account {
    private double balance;
    private String owner;  // owner name

    public Lab2_1_Account(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for " + owner);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Owner: " + owner + ", Balance: " + balance;
    }
}

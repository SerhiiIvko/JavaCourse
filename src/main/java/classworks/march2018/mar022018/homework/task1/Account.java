package classworks.march2018.mar022018.homework.task1;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        if (getBalance() < 0) {
            System.out.println("There is not enough money on the account, refill the account please!");
        } else {
            System.out.println("Current balance = " + getBalance());
        }
    }
}
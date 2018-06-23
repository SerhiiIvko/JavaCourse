package classworks.may2018.may162018.classwork.task4;

//import com.sun.xml.internal.bind.v2.TODO;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        // Начальный счет
        Account2 account = new Account2(0);

        // Накопим немного денег
        new Thread(() -> {
            for (int i = 0; i < 50_000_000; i++) {
                account.deposit(1);
            }
        }).start();

        // Снять деньги со счета???
        //account.withdraw(50_000_000);

        /* TODO: вызвать метод waitAndWithdraw()*/
        System.out.println("Calling waitAndWithdraw()...");
        account.waitAndWithdraw(50_000_000);
        System.out.println("waitAntWithdraw() finished " + account.getBalance());
    }
}

class Account2 {
    private long balance;

    public Account2() {
        this(0L);
    }

    public Account2(long l) {
        this.setBalance(l);
    }

    public long getBalance() {
        return balance;
    }

    private void setBalance(long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
        notify();
    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }

    public synchronized void waitAndWithdraw(long amount) throws InterruptedException {

        /*TODO: проверить достаточно ли денег на счету*/
        while (balance < amount) {
            wait();
        }
        withdraw(amount);
    }

    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);
        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;
    }
}
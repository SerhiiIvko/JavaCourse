package classworks.may2018.may162018.classwork.task3;

import java.util.concurrent.atomic.AtomicLong;

public class Demo3 {

    public static void main(String[] args) throws Exception {
        concurrencyRace();
    }

    // Демонстрация проблемы борьбы за ресурсы
    private static void concurrencyRace() throws InterruptedException {
        Account account = new Account(100_000);
        System.out.println("Begin balance " + account.getBalance());

        // TODO: Создать поток для снятия денег со счета
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 20_000; i++) {
                account.withdraw(1);
            }
        });
        // TODO: Создать поток для внесения денег на счет
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 20_000; i++) {
                account.deposit(1);
            }
        });

        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();

//        if(withdrawThread != null) {
//            withdrawThread.start();
//        }
//
//        if(depositThread != null) {
//            depositThread.start();
//        }
//
//        if(withdrawThread != null) {
//            withdrawThread.join();
//        }
//        if(depositThread != null) {
//            depositThread.join();
//        }
        System.out.println("End balance " + account.getBalance());
    }
}

/**
 * Банковский счет
 */
class Account {

    AtomicLong balance = new AtomicLong();

    //private long balance;
    //Object locker = new Object();
    public Account(long l) {
        this.setBalance(l);
    }

    public long getBalance() {
        //return balance;
        return balance.get();
    }

    private void setBalance(long balance) {
        //this.balance = balance;
        this.balance.set(balance);
    }

    public void deposit(long amount) throws IllegalArgumentException {
        checkAmountNonNegative(amount);
        //synchronized (/*this*/ locker) {
        // balance += amount;}
        balance.getAndAdd(amount);//задать или изменить какието значения
        //}
    }

    private static void checkAmountNonNegative(long amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }

    public synchronized void withdraw(long amount) throws IllegalArgumentException {

        checkAmountNonNegative(amount);
        if (balance.get() < amount) {
            throw new IllegalArgumentException("not enough money");
        }
        //synchronized (/*this*/ locker) {
        //  balance -= amount;
        //}
        balance.getAndAdd(-amount);
    }
}
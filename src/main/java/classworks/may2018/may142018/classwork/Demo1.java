package classworks.may2018.may142018.classwork;

public class Demo1 {

    /* TODO: Реализация интерфейса Runnable */
    static class HelloRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello from runnable " +
                    Thread.currentThread().getName() + " " +
                    Thread.currentThread().getId());
        }
    }

    /* TODO: Наследование класса Thread */
    static class HelloThread extends Thread {
        public HelloThread(String threadName) {
            super(threadName);
        }

        @Override
        public void run() {
            System.out.println("Hello from thread " + getName() + " " + getId());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable helloRunnable = new HelloRunnable();
            Thread t1 = new Thread(helloRunnable, "helloRunnable");
            t1.start();
            Thread t2 = new HelloThread("HelloTread");
            t2.start();
        }

        /* TODO: Анонимный класс реализующий интерфейс Runnable */
        new Thread(() -> System.out.println("Runnable right here " +
                Thread.currentThread().getName())).start();

        /* TODO: Анонимный класс налседующий класс Thread */
        System.out.println("Hello from main thread");
    }
}
package classworks.may2018.may142018.homework.task1;

public class MyThreadClass implements Runnable {
    private int counter = 0;

    @Override
    public void run() {
        System.out.println("Count start = " + counter);
        while (!Thread.currentThread().isInterrupted()) {
            counter++;
        }
        System.out.println("Count finish = " + counter);
    }
}
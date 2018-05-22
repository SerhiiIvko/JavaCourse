package classworks.may2018.may162018.classwork.task6;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Demo6 {

    static class Player extends Thread {
        //Semaphore sync;
        //CountDownLatch sync;
        CyclicBarrier sync;

        public Player(String name, CyclicBarrier cyclicBarrier
                      /*CountDownLatch countDownLatch*/ /*Semaphore semaphore*/) {
            super(name);
            //sync = semaphore;
            //sync = countDownLatch;
            sync = cyclicBarrier;
            start();
        }

        @Override
        public void run() {
            //sync.countDown();
            System.out.println("Player " + getName() + " is ready");
            try {
                sync.await();//
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

//        try {
//                sync.await();//countDown
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

//            try {
//                sync.acquire();//semaphore
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(getName() + " is starting");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //sync.release();//semaphore
        }
    }

    // Synchronization demo
    public static void main(String[] args) {
        //Semaphore semaphore = new Semaphore(2);
        //CountDownLatch countDownLatch = new CountDownLatch(3);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> System.out.println("Start!!!\n-----\n"));
        new Player("one", /*semaphore*//*countDownLatch*/cyclicBarrier);
        new Player("two", /*semaphore*//*countDownLatch*/cyclicBarrier);
        new Player("three", /*semaphore*//*countDownLatch*/cyclicBarrier);
        new Player("four", /*semaphore*//*countDownLatch*/cyclicBarrier);
        new Player("five", /*semaphore*//*countDownLatch*/cyclicBarrier);
        new Player("six", /*semaphore*//*countDownLatch*/cyclicBarrier);
    }
}
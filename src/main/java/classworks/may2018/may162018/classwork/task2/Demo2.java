package classworks.may2018.may162018.classwork.task2;

import java.time.LocalTime;

public class Demo2 {

    public static void main(String[] args) throws Exception {
        /* TODO: Создать экземпляр класса WorkedThread */
        Thread workedThread = new WorkedThread();

        /* TODO: Создать экземпляр класса SleeperThread */
        Thread sleeperThread = new SleeperThread();

        /* TODO: демоны??? */
        //workedThread.setDaemon(true);
        //sleeperThread.setDaemon(true);

        /* TODO: Запустить потоки */
        System.out.println("Starting threads at " + LocalTime.now());
        workedThread.start();
        sleeperThread.start();
        Thread.sleep(100L);

        /* TODO: Прервать потоки */

        System.out.println("Interrupting threads " + LocalTime.now());
        workedThread.interrupt();
        //sleeperThread.interrupt();

        /* TODO: Присоединить потоки */

        System.out.println("Join threads");

        //workedThread.join();

        //sleeperThread.join();

        System.out.println(Thread.currentThread().getName() + " thread done at " + LocalTime.now());
    }

    private static class WorkedThread extends Thread {

        public WorkedThread() {
            super(WorkedThread.class.getSimpleName());
        }

        @Override
        public void run() {
            long sum = 0;
            System.out.println(getName() + " run at: " + LocalTime.now());
            for (int i = 0; i < 2_000_000_000; i++) {
                sum += i;
                /* TODO: Проверить не прерван ли поток */
                if (isInterrupted()) { // Thread.interrupted()
                    System.out.println("Loop interrupted at i = " + i);
                    break;
                }
            }
            System.out.println("End loop for " + getName() + " at: " + LocalTime.now());
        }
    }

    private static class SleeperThread extends Thread {

        public SleeperThread() {
            super(SleeperThread.class.getSimpleName());
        }

        @Override
        public void run() {
            System.out.println(getName() + " run at: " + LocalTime.now());
            /* TODO: Усыпить на 1000 мс */
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
            System.out.println("End " + getName() + " at: " + LocalTime.now());
        }
    }
}
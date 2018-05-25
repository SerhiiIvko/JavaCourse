package classworks.may2018.may232018.controlwork;

import java.util.ArrayList;
import java.util.List;

public class Port {
    private int docCapacity;
    private int containersCapacity;
    private int currentContainersCapacity;
    List<Thread> ships = new ArrayList<>();

    public Port(int docCapacity, int containersCapacity, int currentContainersCapacity) {
        this.docCapacity = docCapacity;
        this.containersCapacity = containersCapacity;
        this.currentContainersCapacity = currentContainersCapacity;
    }

    public int getDocCapacity() {
        return docCapacity;
    }

    public int getContainersCapacity() {
        return containersCapacity;
    }

    public int getCurrentContainersCapacity() {
        return currentContainersCapacity;
    }

    public void addContainer() {
        currentContainersCapacity++;
    }

    public void takeContainer() {
        currentContainersCapacity--;
    }

    public synchronized void askPermission() {
        while (docCapacity == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ships.add(Thread.currentThread());
        System.out.println(Thread.currentThread().getName() + " получил разрешение на вход в порт");
        docCapacity--;
        System.out.println("Свободных причалов " + docCapacity);
    }

    public synchronized void returnPermissionForExit() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " покинул причал");

        System.out.println("Текущее количество контейнеров " + getCurrentContainersCapacity());
        if (ships.contains(Thread.currentThread())) {
            docCapacity++;
            System.out.println("Свободных причалов " + docCapacity);
        }
        ships.remove(Thread.currentThread());
        notifyAll();
    }
}
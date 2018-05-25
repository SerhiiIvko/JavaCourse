package classworks.may2018.may232018.controlwork;

public class Ship extends Thread {
    private int containersToTake;
    private int containersToLive;
    private final Port port;
    int currentContainersQuantity;

    public Ship(String name, int containersToTake, int containersToLive, Port port) {
        super(name);
        this.containersToTake = containersToTake;
        this.containersToLive = containersToLive;
        this.port = port;
        this.currentContainersQuantity = containersToLive;
        start();
    }

    @Override
    public void run() {
        boolean isChanged = false;
        try {
            while (true) {
                if (!isChanged) {
                    port.askPermission();
                }
                isChanged = false;
                if (containersToLive != 0 && containersToTake != 0) {
                    containersToTake--;
                    System.out.println("Контейнеров загружается " + containersToTake);
                    containersToLive--;
                    System.out.println("Контейнеров разгружается " + containersToLive);
                    isChanged = true;
                } else {
                    if (containersToLive != 0) {
                        synchronized (port) {
                            if (port.getContainersCapacity() > port.getCurrentContainersCapacity()) {
                                port.addContainer();
                                containersToLive--;
                                System.out.println("В порту разгружено " + containersToLive + " контейнеров");
                                isChanged = true;
                            }
                        }
                    } else {
                        if (containersToTake != 0) {
                            synchronized (port) {
                                if (port.getCurrentContainersCapacity() > 0) {
                                    port.takeContainer();
                                    containersToTake--;
                                    System.out.println("На корабль загружено " + containersToTake + " контейнеров");
                                    isChanged = true;
                                }
                            }
                        } else {
                            System.out.println(Thread.currentThread().getName() + " выполнил свою задачу в порту");
                            port.returnPermissionForExit();
                            break;
                        }
                    }
                }
                if (isChanged) {
                    Thread.sleep(1000);
                } else {
                    port.returnPermissionForExit();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
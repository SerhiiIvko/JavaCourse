package classworks.may2018.may232018.controlwork;

import java.util.ArrayList;
import java.util.List;

public class PortRunner {
    public static void main(String[] args) {
        Port port = new Port(5, 800, 1000);
        List<Ship> ships = new ArrayList<>();
        System.out.println("Рабочий день начался, корабли запрашивают разрешение на вход в порт.");
        for (int i = 0; i < port.getDocCapacity(); i++) {
            ships.add(new Ship("Корабль " + i, 30, 10, port));
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Ship ship : ships) {
            try {
                ship.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Все корабли окончили работу в этот день");
    }
}
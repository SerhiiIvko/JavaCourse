package classworks.december2017.dec262017.task16;

//1.Работа светофора для водителей запрограммирована следующим образом: начиная с начала каждого часа, в течении трех минут горит зелёный
// сигнал, затем в течении одной минуты – желтый, в течении двух минут – красный, в течении трёх минут опять зелёный и т.д. Дано число t,
// означающее время в минутах, прошедшее сначала очередного часа. Определить сигнал какого цвета горит для водителей в этот момент.

import java.util.Scanner;

public class RoadLighter {
    public static void main(String[] args) {
        System.out.println("Input time of hour");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        scanner.close();

        if (time < 0) {
            System.out.println("Incorrect input");
            return;
        }

        int greenTime = 3;
        int yellowTime = 1;
        int redTime = 2;

        int lightLoop = greenTime + yellowTime + redTime;

        if (time % lightLoop < 3) {
            System.out.println("Light green now");
        } else if (time % lightLoop < 4) {
            System.out.println("Light yellow now");
        } else {
            System.out.println("Light red now");
        }
    }
}

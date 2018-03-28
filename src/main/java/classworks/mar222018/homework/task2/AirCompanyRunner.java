package classworks.mar222018.homework.task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
 * Провести сортировку самолетов компании по дальности полета. Найти самолет в компании, соответствующий заданному
 * диапазону параметров потребления горючего.
 */
public class AirCompanyRunner {
    public static void main(String[] args) {
        Aircraft[] aircrafts = new Aircraft[5];
        aircrafts[0] = new Boeing737("Boeing-737", 200, 100, 3500, 20);
        aircrafts[1] = new Boeing747("Boeing-747", 250, 108, 3700, 18);
        aircrafts[2] = new Boeing777("Boeing-777", 320, 180, 4500, 22);
        aircrafts[3] = new AirbusA310("Airbus-A310", 200, 98, 3200, 17);
        aircrafts[4] = new AirbusA320("Airbus-A320", 220, 106, 3400, 18.5);

        Aircompany aircompany = new Aircompany(aircrafts);
        System.out.println("Aircraft info: ");
        System.out.println(aircompany.printAircraftsInfo());
        System.out.println("Sorting aircraft by flying range:");
        Arrays.sort(aircrafts);
        System.out.println(aircompany.printAircraftsInfo());
        System.out.println("Average baggage volume of all aircraft = " + aircompany.getAverageBaggageVolume());
        System.out.println("Average passengers places of all aircraft = " + aircompany.getAveragePassengerCount());

        System.out.println("Input start and end of range fuel consume for search:");
//        Scanner scanner = new Scanner(System.in);
//        double startRangeConsume = scanner.nextDouble();
//        double endRangeConsume = scanner.nextDouble();
//        scanner.close();
        aircompany.findPlaneByConsumer(aircrafts, 18, 20);
    }
}
package classworks.april.apr032018.homeworks.task2;

import classworks.april.apr032018.homeworks.task2.airpark.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
 * Провести сортировку самолетов компании по дальности полета. Найти самолет в компании, соответствующий заданному
 * диапазону параметров потребления горючего.
 * Добавить блоки try/catch
 */
public class AirCompanyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aircraft[] aircraft = new Aircraft[]{
                new Boeing737("Boeing-737", 200, 100, 3500, 20),
                new Boeing747("Boeing-747", 250, 108, 3700, 18),
                new Boeing777("Boeing-777", 320, 180, 4500, 22),
                new AirbusA310("Airbus-A310", 200, 98, 3200, 17),
                new AirbusA320("Airbus-A320", 220, 106, 3400, 18.5),
        };
        Aircompany aircompany = new Aircompany(aircraft);
        System.out.println("Input index for displaying info about aircraft: ");
        int index = scanner.nextInt();
        Aircraft aircraftByIndex = aircompany.getAircraftByIndex(index);
        if (aircraftByIndex != null) {
            System.out.println(aircraftByIndex.toString() + "\n");
        } else {
            System.out.println("No aircraft for index: " + index + "\n");
        }
        System.out.println("Aircraft info: ");
        System.out.println(aircompany.getAircraftInfo());
        System.out.println("Sorting aircraft by flying range:");
        Arrays.sort(aircraft);
        System.out.println(aircompany.getAircraftInfo());
        System.out.println("Average baggage volume of all aircraft = " + aircompany.getAverageBaggageVolume());
        System.out.println("Average passengers places of all aircraft = " + aircompany.getAveragePassengerCount());
        System.out.println("Input start and end of range fuel consume for search:");
        double startRangeConsume = scanner.nextDouble();
        double endRangeConsume = scanner.nextDouble();
        scanner.close();
        List<Aircraft> filteredPlanes = aircompany.filterPlanesByConsumption(aircraft, startRangeConsume, endRangeConsume);
        if (filteredPlanes.isEmpty()) {
            System.out.println("No aircraft found for this parameters!");
        } else {
            filteredPlanes.stream().map(Aircraft::toString).forEach(System.out::println);
        }
    }
}
package classworks.march2018.mar292018.controlwork.task2;

import classworks.march2018.mar292018.controlwork.task2.traipark.DieselFast;
import classworks.march2018.mar292018.controlwork.task2.traipark.DieselLocomotive;
import classworks.march2018.mar292018.controlwork.task2.traipark.ElectroFast;
import classworks.march2018.mar292018.controlwork.task2.traipark.ElectroLocomotive;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainRunner {
    public static void main(String[] args) {
        PassTrain[] passTrain = new PassTrain[]{
                new DieselFast("Дизельный скорый поезд", 1, 3.5, 55, 12),
                new ElectroFast("Скоростная электричка", 3, 3, 44, 7),
                new DieselLocomotive("Дизельный поезд", 4, 4.5, 64, 15),
                new ElectroLocomotive("Пассажирская электричка", 2, 4, 94, 18)
        };
        TrainPark trainPark = new TrainPark(passTrain);
        System.out.println("Общая вместимость пассажиров подвижного состава " + trainPark.getAllPassengerCount() + " человек");
        System.out.println("Общая грузоподъёмность поездов " + trainPark.getAllBaggageCount() + " тонн");
        System.out.println("Сортировка поездов по уровню комфорта: ");
        Arrays.sort(passTrain);
        System.out.println(trainPark.getTrainsInfo());
        System.out.println("Введите параметры для поиска поезда по заданному количеству пассажиров в вагоне: ");
        Scanner scanner = new Scanner(System.in);
        int startRangePassengers = scanner.nextInt();
        int endRangePassengers = scanner.nextInt();
        scanner.close();
        List<PassTrain> filteredPlanes = trainPark.filterTrainsByPassengersCount(passTrain, startRangePassengers, endRangePassengers);
        if (filteredPlanes.isEmpty()) {
            System.out.println("Нет поездов с заданными параметрами количества пассажиров в вагоне!");
        } else {
            filteredPlanes.stream().map(PassTrain::toString).forEach(System.out::println);
        }
    }
}
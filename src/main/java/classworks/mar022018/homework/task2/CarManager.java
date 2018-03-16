package classworks.mar022018.homework.task2;

import java.util.Calendar;
import java.util.function.Predicate;

public class CarManager {
    private Car[] cars;

    public CarManager(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCarsExploitedMoreThan(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return findCars(car -> currentYear - car.getYearProduction() > year);
    }

    public Car[] getCarsMoreExpensiveThan(double price) {
        return findCars(car -> car.getPrice() > price);
    }

    public Car[] getCarsByType(String type) {
        return findCars(car -> car.getType().equals(type));
    }

    public void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    private Car[] findCars(Predicate<Car> predicate) {
        Car[] foundCars = new Car[cars.length];
        int counterFoundCars = 0;
        for (int i = 0; i < cars.length; i++) {
            if (predicate.test(cars[i])) {
                foundCars[counterFoundCars++] = cars[i];
            }
        }
        Car[] result = new Car[counterFoundCars];
        System.arraycopy(foundCars, 0, result, 0, counterFoundCars);
        return result;
    }
}
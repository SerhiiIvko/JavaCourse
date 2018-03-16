package classworks.mar022018.homework.task2;

public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(100, 8126, 2010, 6000, "Daewoo", "Matiz", "black");
        cars[1] = new Car(102, 7452, 2005, 3000, "Daewoo", "Lanos", "metallic");
        cars[2] = new Car(105, 8361, 1990, 700, "ZAZ", "Tavria", "red");
        cars[3] = new Car(107, 3684, 2016, 11000, "BMW", "X5", "white");
        cars[4] = new Car(109, 9788, 2000, 4000, "Renault", "Logan", "yellow");

        CarManager carManager = new CarManager(cars);

        int price = 3000;
        String type = "Daewoo";
        int year = 10;

        Car[] carsByPrice = carManager.getCarsMoreExpensiveThan(price);
        Car[] carsByType = carManager.getCarsByType(type);
        Car[] carsByAge = carManager.getCarsExploitedMoreThan(year);

        System.out.println(String.format("cars more expensive than %d", price));
        carManager.printCars(carsByPrice);
        System.out.println(String.format("cars with type %s", type));
        carManager.printCars(carsByType);
        System.out.println(String.format("cars older than %d", year));
        carManager.printCars(carsByAge);
        cars[1].setType("Lexus");
    }
}
package classworks.mar022018.homework.task2;

public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(100, 8126, 2010, 6000, "Daewoo", "Matiz", "black");
        cars[1] = new Car(102, 7452, 2005, 3000, "Daewoo", "Lanos", "metallic");
        cars[2] = new Car(105, 8361, 1990, 700, "ZAZ", "Tavria", "red");
        cars[3] = new Car(107, 3684, 2016, 11000, "BMW", "X5", "white");
        cars[4] = new Car(109, 9788, 2000, 4000, "Renault", "Logan", "yellow");


        for (int i = 0; i < cars.length; i++) {
            cars[i].getOldCars(15, cars);
            break;
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            cars[i].getType("Daewoo", cars);
            break;
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            cars[i].getCarByPrice(3000, cars);
            break;
        }
        System.out.println();
        cars[3].setType("Lexus");
        for (int i = 0; i < cars.length; i++) {
            cars[i].getType("Lexus", cars);
            break;
        }
    }
}
package classworks.mar012018.classwork.task1;

public class CarRunner {
    public static void main(String[] args) {
        Car minivan = new Car();
        Car sportCar = new Car();
        int distance = 300;
        double liters;
        minivan.setCar(7, 40, 10);
        sportCar.setCar(2, 60, 25);

        System.out.println("Minivan can contains " + minivan.passengers + " passengers and transporting them to "
                + minivan.range() + " kilometers");
        System.out.println("Minivan can contains " + sportCar.passengers + " passengers and transporting them to "
                + sportCar.range() + " kilometers");
        liters = minivan.fuelNeeded(distance);
        System.out.println("For distance " + distance + " need "
                + liters + " liters");
        liters = sportCar.fuelNeeded(distance);
        System.out.println("For distance " + distance + " need "
                + liters + " liters");
    }
}
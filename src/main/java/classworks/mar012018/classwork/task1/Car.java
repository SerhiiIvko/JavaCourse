package classworks.mar012018.classwork.task1;

public class Car {
    public int passengers;
    public int fuelTank;
    public int consumption;

    public int range() {
        return fuelTank / consumption * 100;
    }

    public double fuelNeeded(int kilometers) {
        return (double) kilometers / consumption;
    }

    void setCar(int p, int f, int c) {
        passengers = p;
        fuelTank = f;
        consumption = c;
    }
}
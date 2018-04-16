package classworks.april.apr032018.homeworks.task2;

import classworks.march2018.mar222018.homework.airparkrenovated.IPlane;

public class Aircraft implements Comparable<Aircraft>, IPlane {
    private String name;
    private double valueBaggage;
    private int countPassengers;
    private double flyingRange;
    private double fuelConsumption;

    public Aircraft(String name, double valueBaggage, int countPassengers, double flyingRange, double fuelConsumption) {
        this.name = name;
        this.valueBaggage = valueBaggage;
        this.countPassengers = countPassengers;
        this.flyingRange = flyingRange;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getValueBaggage() {
        return valueBaggage;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getFlyingRange() {
        return flyingRange;
    }

    @Override
    public String toString() {
        return "Aircraft type '" + name + "'\n" +
                "Value of baggage camera = " + valueBaggage + " cube meters " +
                ", Count of passengers places = " + countPassengers +
                ", Flying range = " + flyingRange + " km" +
                ", Consumer = " + fuelConsumption + " liters for 1 km\n";
    }

    @Override
    public int compareTo(Aircraft o) {
        return Double.compare(this.flyingRange, o.flyingRange);
    }
}
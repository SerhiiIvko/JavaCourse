package classworks.mar222018.homework.airparkrenovated;

public class Plane implements IPlane {
    private String name;
    private double valueBaggage;
    private int countPassengers;
    private double flyingRange;
    private double fuelConsumption;

    public Plane(String name, double valueBaggage, int countPassengers, double flyingRange, double fuelConsumption) {
        this.name = name;
        this.valueBaggage = valueBaggage;
        this.countPassengers = countPassengers;
        this.flyingRange = flyingRange;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getValueBaggage() {
        return valueBaggage;
    }

    @Override
    public int getCountPassengers() {
        return countPassengers;
    }

    @Override
    public double getFlyingRange() {
        return flyingRange;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", valueBaggage=" + valueBaggage +
                ", countPassengers=" + countPassengers +
                ", flyingRange=" + flyingRange +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
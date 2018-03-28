package classworks.mar222018.homework.task2;

public class Aircraft implements Comparable<Aircraft> {
    private String name;
    private double valueBaggage;
    private int countPassengers;
    private double flyingRange;
    private double consumer;

    public Aircraft(String name, double valueBaggage, int countPassengers, double flyingRange, double consumer) {
        this.name = name;
        this.valueBaggage = valueBaggage;
        this.countPassengers = countPassengers;
        this.flyingRange = flyingRange;
        this.consumer = consumer;
    }

    public double getConsumer() {
        return consumer;
    }

    public double getValueBaggage() {
        return valueBaggage;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    @Override
    public String toString() {
        return "Aircraft type '" + name + "'\n" +
                "Value of baggage camera = " + valueBaggage + " cube meters " +
                ", Count of passengers places = " + countPassengers +
                ", Flying range = " + flyingRange + " km" +
                ", Consumer = " + consumer + " liters for 1 km\n";
    }

    @Override
    public int compareTo(Aircraft o) {
        return Double.compare(this.flyingRange, o.flyingRange);
    }
}

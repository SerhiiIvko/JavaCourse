package classworks.march2018.mar292018.controlwork.task2;

public class PassTrain implements Comparable<PassTrain> {
    private String name;
    private int comfortClass;
    private double baggageCount;
    private int passengersCount;
    private int carriageCount;

    public PassTrain(String name, int comfortClass, double baggageCount, int passengersCount, int carriageCount) {
        this.name = name;
        this.comfortClass = comfortClass;
        this.baggageCount = baggageCount;
        this.passengersCount = passengersCount;
        this.carriageCount = carriageCount;
    }

    public double getBaggageCount() {
        return baggageCount;
    }

    public int getComfortClass() {
        return comfortClass;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    @Override
    public int compareTo(PassTrain o) {
        return Integer.compare(this.getComfortClass(), o.getComfortClass());
    }

    @Override
    public String toString() {
        return name + ". " +
                "Класс комфорта: " + comfortClass +
                ", Количество вмещаемого багажа, тонн: " + baggageCount +
                ", Количество пассажиров: " + passengersCount +
                ", Количество вагонов: " + carriageCount;
    }
}
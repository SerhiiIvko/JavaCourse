package classworks.march2018.mar222018.homework.airparkrenovated;

public interface IPlane {
    String getName();

    double getValueBaggage();

    int getCountPassengers();

    double getFlyingRange();

    double getFuelConsumption();

    @Override
    String toString();
}
package classworks.mar222018.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {
    private Aircraft[] aircraft;

    Aircompany(Aircraft[] aircraft) {
        this.aircraft = aircraft;
    }

    String getAircraftInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Aircraft aircraft : aircraft) {
            stringBuilder = stringBuilder.append(aircraft.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public double getAverageBaggageVolume() {
        double averageVolume = 0;
        for (int i = 0; i < aircraft.length; i++) {
            averageVolume += aircraft[i].getValueBaggage();
        }
        return averageVolume / aircraft.length;
    }

    public double getAveragePassengerCount() {
        double averagePlacesCount = 0;
        for (int i = 0; i < aircraft.length; i++) {
            averagePlacesCount += aircraft[i].getCountPassengers();
        }
        return (int) averagePlacesCount / aircraft.length;
    }

    public List<Aircraft> filterPlanesByConsumption(Aircraft[] plains, double minConsumption, double maxConsumption) {
        List<Aircraft> filteredPlanes = new ArrayList<>();
        for (int i = 0; i < plains.length; i++) {
            Aircraft plane = plains[i];
            if (plane.getFuelConsumption() >= minConsumption
                    && plane.getFuelConsumption() <= maxConsumption) {
                filteredPlanes.add(plane);
            }
        }
        return filteredPlanes;
    }
}
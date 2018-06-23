package classworks.april.apr032018.homeworks.task2;

//import com.sun.istack.internal.Nullable;

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
        return averageVolume;
    }

    public double getAveragePassengerCount() {
        double averagePlacesCount = 0;
        for (int i = 0; i < aircraft.length; i++) {
            averagePlacesCount += aircraft[i].getCountPassengers();
        }
        return (int) averagePlacesCount;
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

    //    @Nullable
    public Aircraft getAircraftByIndex(int index) {
        Aircraft aircraft = null;
        try {
            for (int i = 0; i < this.aircraft.length; i++) {
                if (i == index) {
                    aircraft = this.aircraft[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("No aircraft for index: " + index);
        }
        return aircraft;
    }
}
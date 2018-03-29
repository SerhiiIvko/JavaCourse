package classworks.mar222018.homework.airparkrenovated;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

public class AirCompany {
    private List<IPlane> planes;

    public AirCompany(List<IPlane> planes) {
        this.planes = planes;
    }

    public List<IPlane> getPlanes() {
        return planes;
    }

    public double getAllValueBaggage() {
        return planes.stream().map(IPlane::getValueBaggage).mapToDouble(Double::doubleValue).sum();
    }

    public int getAllCountPassengers() {
        return planes.stream().map(IPlane::getCountPassengers).mapToInt(Integer::intValue).sum();
    }

    public List<IPlane> sortByFlyingRange() {
        return planes.stream().sorted(Comparator.comparingDouble(IPlane::getFlyingRange)).collect(Collectors.toList());
    }

    public List<IPlane> getFilteredPlanesByConsumption(double minConsumption, double maxConsumption) {
        return planes
                .stream()
                .filter(plane -> plane.getFuelConsumption() >= minConsumption && plane.getFuelConsumption() <= maxConsumption)
                .collect(Collectors.toList());
    }

    public IPlane findPlaneByConsumption(double minConsumption, double maxConsumption) {
        return planes
                .stream()
                .filter(plane -> plane.getFuelConsumption() >= minConsumption && plane.getFuelConsumption() <= maxConsumption)
                .findFirst()
                .orElseThrow(() -> new InputMismatchException("No such plane"));
    }
}
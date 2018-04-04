package classworks.march2018.mar222018.homework.airparkrenovated;

import classworks.march2018.mar222018.homework.task2.airpark.*;

import java.util.ArrayList;
import java.util.List;

public class AirCompanyRunner {
    public static void main(String[] args) {
        List<IPlane> planes = new ArrayList<>();
        planes.add(new Boeing737("Boeing-737", 200, 100, 3500, 20));
        planes.add(new Boeing747("Boeing-747", 250, 108, 3700, 18));
        planes.add(new Boeing777("Boeing-777", 320, 180, 4500, 22));
        planes.add(new AirbusA310("Airbus-A310", 200, 98, 3200, 17));
        planes.add(new AirbusA320("Airbus-A320", 220, 106, 3400, 18.5));

        AirCompany company = new AirCompany(planes);
        double allValueBaggage = company.getAllValueBaggage();
        int allCountPassengers = company.getAllCountPassengers();
        System.out.println(String.format("allValueBaggage: %s, allCountPassengers: %s", allValueBaggage, allCountPassengers));
        System.out.println("before sort:");
        company.getPlanes().stream().map(IPlane::getFlyingRange).forEach(range -> System.out.print(range + " "));
        System.out.println();
        List<IPlane> sortedPlanes = company.sortByFlyingRange();
        System.out.println("after sort:");
        sortedPlanes.stream().map(IPlane::getFlyingRange).forEach(range -> System.out.print(range + " "));
        System.out.println();
        System.out.println(company.findPlaneByConsumption(18, 19));
    }
}
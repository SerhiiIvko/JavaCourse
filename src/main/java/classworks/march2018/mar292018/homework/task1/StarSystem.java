package classworks.march2018.mar292018.homework.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StarSystem {

    public List<Planet> addPlanet(Planet[] planets) {
        List<Planet> planetsInSystem = new ArrayList<>();
        planetsInSystem.addAll(Arrays.asList(planets));
        return planetsInSystem;
    }

    public int getCountPlanets(List<Planet> planetsInSystem) {
        if (!planetsInSystem.isEmpty()) {
            return planetsInSystem.size();
        } else {
            System.out.println("No planets");
        }
        throw new IllegalArgumentException("Star system so young and planets not created yet!");
    }
}
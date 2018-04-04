package classworks.march2018.mar292018.homework.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Planet {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Moon> addMoon(Moon[] moons) {
        List<Moon> satelits = new ArrayList<>();
        satelits.addAll(Arrays.asList(moons));
        return satelits;
    }

    @Override
    public String toString() {
        return "Added planet name '" + name + "'";
    }
}
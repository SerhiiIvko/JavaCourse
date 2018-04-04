package classworks.march2018.mar292018.homework.task1;

import java.util.List;

/**
 * Создать объект класса Звездная система, используя классы Планета, Звезда, Луна. Методы: вывести на консоль
 * количество планет в звездной системе, название звезды, добавление планеты в систему.
 */
public class StarSystemRunner {
    public static void main(String[] args) {
        Star star = new Star("Sun");
        Planet[] planetsSolarSystem = new Planet[]{
                new Planet("Mercury"),
                new Planet("Venus"),
                new Planet("Earth"),
                new Planet("Mars"),
                new Planet("Jupiter"),
                new Planet("Saturn"),
                new Planet("Uranus"),
                new Planet("Neptune"),
                new Planet("Dwarf planet Pluto")
        };
        StarSystem starSystem = new StarSystem();
        starSystem.addPlanet(planetsSolarSystem);
        List<Planet> planetList = starSystem.addPlanet(planetsSolarSystem);
        System.out.println("Name of star: " + star.getName());
        System.out.println("Count of planets in this star system: " + starSystem.getCountPlanets(planetList));
        planetList.stream().map(Planet::toString).forEach(System.out::println);

        Star star1 = new Star("Sirius");
        Planet[] planetsSiriusSystem = new Planet[]{
                new Planet("A-114"),
                new Planet("B-101"),
                new Planet("B-110")
        };
        StarSystem newStarSystem = new StarSystem();
        newStarSystem.addPlanet(planetsSiriusSystem);
        List<Planet> sirius = newStarSystem.addPlanet(planetsSiriusSystem);
        System.out.println("Name of star: " + star1.getName());
        System.out.println("Count of planets in this star system: " + newStarSystem.getCountPlanets(sirius));
        sirius.stream().map(Planet::toString).forEach(System.out::println);
    }
}
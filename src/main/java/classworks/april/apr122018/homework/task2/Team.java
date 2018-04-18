package classworks.april.apr122018.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    private int id;
    private String teamName;
    private List<Developer> developers;

    public Team(int id, String teamName) {
        this.id = id;
        this.teamName = teamName;
        this.developers = new ArrayList<>();
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public String getDevelopersNamesAsString() {
        return developers.stream().map(Developer::getName).collect(Collectors.joining(", "));
    }

    public String getFullDevelopersInfo() {
        return developers
                .stream()
                .map(developer -> developer.getName() + " (Developer's skills: " + developer.getSkillsAsString() + ")")
                .collect(Collectors.joining(";\n"));
    }

    @Override
    public String toString() {
        return "Team: " + teamName + ", team id: " + id + "\nDevelopers list:\n" + getFullDevelopersInfo();
    }
}
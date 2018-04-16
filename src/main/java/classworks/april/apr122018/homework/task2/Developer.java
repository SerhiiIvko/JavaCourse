package classworks.april.apr122018.homework.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivko on 13.04.18.
 */
public class Developer {
    private int developerId;
    private String name;
    private List<String> skills;

    public Developer(int developerId, List<String> skills, String name) {
        this.developerId = developerId;
        this.name = name;
        this.skills = new ArrayList<>(skills);
    }

    @Override
    public String toString() {
        return "Developer ID: " + developerId +
                ", name: '" + name + '\'' +
                ", skills: " + skills
                + "\n";
    }
}
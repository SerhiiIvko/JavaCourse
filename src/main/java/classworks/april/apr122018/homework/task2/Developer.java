package classworks.april.apr122018.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ivko on 13.04.18.
 */
public class Developer {
    private int id;
    private String name;
    private List<Skill> skills;

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public String getName() {
        return name;
    }

    public String getSkillsAsString() {
        return skills.stream().map(Skill::getName).collect(Collectors.joining(", "));
    }
}
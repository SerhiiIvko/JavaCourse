package classworks.april.apr122018.homework.task2;

import java.util.List;

/**
 * Создать класс Team, который содержит коллекции экземпляров класс Developer.
 * ● Класс Developer содержит коллекцию классов Skill
 * ● Создать класс Project, который содержит экземпляр класса Team.
 * ● Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести их навыки.
 */
public class Team {
    private String teamName;
    private int id;
    private List<Developer> team;

    public Team(String teamName, List<Developer> team, int id) {
        this.teamName = teamName;
        this.id = id;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Team: " + teamName +
                ", team id: " + id +
                "\n" + team;
    }
}
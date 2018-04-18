package classworks.april.apr122018.homework.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivko on 13.04.18.
 */

/**
 * Создать класс Team, который содержит коллекции экземпляров класс Developer.
 * ● Класс Developer содержит коллекцию классов Skill
 * ● Создать класс Project, который содержит экземпляр класса Team.
 * ● Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести их навыки.
 */

public class Project {
    public static void main(String[] args) {
        Team team = new Team(101, "New team");
        Developer developer1 = new Developer(1, "Ivan");
        developer1.addSkill(new Skill("Java"));
        developer1.addSkill(new Skill("C++"));
        developer1.addSkill(new Skill("JavaScript"));
        developer1.addSkill(new Skill("HTML"));
        developer1.addSkill(new Skill("SQL"));
        team.addDeveloper(developer1);
        Developer developer2 = new Developer(2, "Philip");
        developer2.addSkill(new Skill("JavaScript"));
        developer2.addSkill(new Skill("HTML"));
        developer2.addSkill(new Skill("SQL"));
        team.addDeveloper(developer2);
        System.out.println(team.toString());
    }
}
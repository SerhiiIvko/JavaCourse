package classworks.april.apr122018.homework.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivko on 13.04.18.
 */
public class Project {
    public static void main(String[] args) {
        List<String> skillsFirstDeveloper = new ArrayList<>();
        String javaSkill = "Java";
        String cppSkill = "C++";
        String javaScriptSkill = "JavaScript";
        String htmlSkill = "HTML";
        String sqlSkill = "SQL";
        skillsFirstDeveloper.add(javaSkill);
        skillsFirstDeveloper.add(cppSkill);
        skillsFirstDeveloper.add(javaScriptSkill);
        skillsFirstDeveloper.add(htmlSkill);
        skillsFirstDeveloper.add(sqlSkill);

        List<String> skillsSecondDeveloper = new ArrayList<>();
        skillsSecondDeveloper.add(javaScriptSkill);
        skillsSecondDeveloper.add(htmlSkill);
        Developer developer1 = new Developer(1, skillsFirstDeveloper, "Ivan");
        Developer developer2 = new Developer(2, skillsSecondDeveloper, "Philipp");
        List<Developer> developers = new ArrayList<>();
        developers.add(developer1);
        developers.add(developer2);
        Team team = new Team("New team", developers, 555);

        System.out.println(team.toString());
    }
}
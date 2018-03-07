package classworks.mar022018.classwork.task3;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer(1, "Vasya", "Ivanov", "Java developer",
                3, 3000.0);

        System.out.println(developer.toString());
        System.out.println();
        developer.setId(2);
        developer.setFirstName("Max");
        developer.setLastName("Petrov");
        developer.setSpeciality("C++");
        developer.setExperience(2);
        developer.setSalary(2000);
        System.out.println();
        developer.writeCode();
        developer.getDepression();
        developer.solveProblem();
        developer.enjoyTheLife();
        System.out.println();
        System.out.println(developer.toString());
        System.out.println();

        if (developer.getId() > 0) {
            System.out.println("Developers working");
        }

        System.out.println("Developer study advanced " + (developer.getSpeciality()) + " and JavaScript");
        System.out.println("Developer have " + (developer.getExperience() + 1) + " year experience");
        System.out.println(developer.getFirstName() + " " + developer.getLastName() + ", good works!");
        System.out.println("Salary is " + (developer.getSalary() + 500));
    }
}
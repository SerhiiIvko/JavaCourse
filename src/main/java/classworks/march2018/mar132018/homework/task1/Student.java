package classworks.march2018.mar132018.homework.task1;

public class Student extends Man {
    private int yearStudying;

    public Student(String name, int age, double weight, int yearStudying) {
        super(name, age, weight);
        this.yearStudying = yearStudying;
    }

    public void startYearStudying() {
        if (getAge() > 17) {
            System.out.println("Student " + getName() + " start studying in " + yearStudying + " year");
        }
    }

    public void increaseYearStudying() {
        if (22 - getAge() < 0) {
            System.out.println("Student ended current course studying and he can start study other course");
        } else {
            System.out.println("Student must be studying else " + (22 - getAge()) + " years");
        }
    }
}
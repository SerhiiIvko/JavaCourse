package classworks.march2018.mar132018.homework.task1;

public class Runner {
    public static void main(String[] args) {
        String name = "Ivan";
        int age = 20;
        double weight = 65.0;
        int yearStudy = 2000;

        Student student = new Student(name, age, weight, yearStudy);
        student.setName(name);
        student.setAge(age);
        student.setWeight(weight);
        student.startYearStudying();
        student.increaseYearStudying();
    }
}
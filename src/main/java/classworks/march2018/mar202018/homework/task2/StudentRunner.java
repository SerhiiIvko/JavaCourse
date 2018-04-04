package classworks.march2018.mar202018.homework.task2;

/**
 * Программа должна выводить на экран список студентов группы, указывая в стpочку через пробел фамилию, год рождения, три
 * оценки и средний бал. Необходимо разработать систему классов для реализации программы.
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student[] student = {
                new Student(1, 1990, "Arbuzov Danil", 5, 5, 7),
                new Student(2, 1991, "Petrov Ivan", 7, 8, 7),
                new Student(3, 1992, "Nikiforov Stepan", 5, 9, 7),
                new Student(4, 1990, "Sidorov Dmitry", 9, 11, 11),
                new Student(5, 1990, "John Smith", 7, 10, 10)
        };
        Group group = new Group(student);
        System.out.println(group.printGroupInfo());
    }
}
package classworks.april.apr232018.homework.task1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExcersice {

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public Student(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name = '" + name + '\'' +
                    ", age = " + age +
                    ", sex = " + sex +
                    '}' + "\n";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student people = (Student) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    private static Collection<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN)
    );

    static List<Student> ex01(Collection<Student> students) {
        return students.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        // TODO: Задание 1
        // Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)
    }

    static Double ex02(Collection<Student> students) {
        // TODO: Задание 2
        // Найти средний возраст среди мужчин
        return students.stream().filter((p) -> p.getSex() == Sex.MAN).
                mapToInt(Student::getAge).average().getAsDouble();
    }

    static Long ex03(Collection<Student> students) {
        return students.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) ||
                        (p.getSex() == Sex.MAN && p.getAge() < 60)).count();
        // TODO: Задание 3
        // Найти кол-во потенциально работоспособных
        // студентов в выборке (т.е. от 18 лет и учитывая
        // что женщины выходят в 55 лет, а мужчина в 60)
    }

    static List<Student> ex04(Collection<Student> students) {
        // TODO: Задание 4
        // Отсортировать студентов по имени в обратном алфавитном порядке
        return students.stream().sorted((s1, s2) -> -s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
    }

    static Student ex05(Collection<Student> students) {
        //  TODO: Задание 5
        //  найти студента с максимальным возрастом
        return students.stream().max(Comparator.comparing(Student::getAge)).get();

    }

    static Student ex06(Collection<Student> students) {
        // TODO: Задание 6
        // Найти студента с минимальным возрастом
        return students.stream().min(Comparator.comparing(Student::getAge)).get();
    }

    public static void main(String[] args) {
        // TODO: тестировать здесь
        System.out.println("Ex1\n" + ex01(students).toString());
        System.out.println("Ex2\n" + ex02(students).toString());
        System.out.println("Ex3\n" + ex03(students).toString());
        System.out.println("Ex4\n" + ex04(students).toString());
        System.out.println("Ex5\n" + ex05(students).toString());
        System.out.println("Ex6\n" + ex06(students).toString());
    }
}
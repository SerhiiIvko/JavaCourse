package classworks.mar132018.homework.task1;

/**
 * Создать класс Man (человек), с полями: имя, возраст, пол и вес.
 * Определить методы задания имени, возраста и веса.
 * Создать производный класс Student, имеющий поле года обучения.
 * Определить методы задания и увеличения года обучения.
 */
public class Man {
    private String name;
    private int age;
    private double weight;

    public Man(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
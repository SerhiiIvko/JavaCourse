package classworks.march2018.mar132018.classwork.task3;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal whoIs;
        whoIs = animal;
        whoIs.say();
        whoIs = dog;
        whoIs.say();
        whoIs = cat;
        whoIs.say();
    }
}
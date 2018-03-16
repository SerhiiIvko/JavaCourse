package classworks.mar132018.homework.task2;

/**
 * Создать сущности Кот, Собака, Щука, Золотая Рыбка, Рыба, Животное, Летающий, Плавающий, Бегающий, Прыгающий, Кушающий,
 * Домашнее животное.
 * Подумать, что от чего наследовать.
 */
public class ClassThingsRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        GoldFish goldFish = new GoldFish();
        Pike pike = new Pike();
        Pet pet = new Pet();
        Eating eating = new Eating();
        Flying flying = new Flying();
        Jumping jumping = new Jumping();
        Running running = new Running();

        animal.printInfo();
        cat.printInfo();
        dog.printInfo();
        pet.printInfo();
        fish.printInfo();
        goldFish.printInfo();
        pike.printInfo();
        eating.printInfo();
        flying.printInfo();
        jumping.printInfo();
        running.printInfo();
    }
}
package classworks.march2018.mar062018.classwork.task5;

public class ConstructorRunner {
    public static void main(String[] args) {
        Constructor constructor = new Constructor(10);
        Constructor constructor1 = new Constructor(constructor);

        System.out.println(constructor.sum);
        System.out.println(constructor1.sum);
    }
}
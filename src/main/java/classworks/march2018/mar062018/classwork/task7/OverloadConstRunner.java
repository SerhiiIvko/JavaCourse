package classworks.march2018.mar062018.classwork.task7;

public class OverloadConstRunner {
    public static void main(String[] args) {
        OverloadConstructor constructor1 = new OverloadConstructor();
        OverloadConstructor constructor2 = new OverloadConstructor(55);
        OverloadConstructor constructor3 = new OverloadConstructor(25.25);
        OverloadConstructor constructor4 = new OverloadConstructor(6, 7);

        System.out.println(constructor1.x);
        System.out.println(constructor2.x);
        System.out.println(constructor3.x);
        System.out.println(constructor4.x);
    }
}
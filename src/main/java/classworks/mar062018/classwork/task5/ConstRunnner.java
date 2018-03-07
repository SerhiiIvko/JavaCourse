package classworks.mar062018.classwork.task5;

public class ConstRunnner {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(88);
        Constructor constructor2 = new Constructor(17.5);
        Constructor constructor3 = new Constructor(2, 4);
        Constructor constructor4 = new Constructor();

        System.out.println(constructor.getX());
        System.out.println(constructor1.getX());
        System.out.println(constructor2.getX());
        System.out.println(constructor3.getX());
        System.out.println(constructor4.getX());
    }
}

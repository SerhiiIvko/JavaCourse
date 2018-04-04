package classworks.march2018.mar222018.classwork.task1;

public class ClassRunner {
    public static void main(String[] args) {
        ClassImplementInterface implement = new ClassImplementInterface();

        System.out.println(implement.getNumber());
        System.out.println(implement.getString());
        int number = InterfaceDefaultMethod.getDefaultNumber();
        System.out.println(number);
    }
}
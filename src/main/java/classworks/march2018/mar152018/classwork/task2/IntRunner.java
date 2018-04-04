package classworks.march2018.mar152018.classwork.task2;

public class IntRunner {
    public static void main(String[] args) {
        InterfaceTest interfaceTest = new ClassTest();
        int a = 3;
        int b = 5;
        System.out.println(interfaceTest.getHeight());
        System.out.println(interfaceTest.getWidth());

        interfaceTest.getHeight();
    }
}
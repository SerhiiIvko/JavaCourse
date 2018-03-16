package classworks.mar152018.classwork.task2;

public class ClassTest implements InterfaceTest {
    @Override
    public double getWidth() {
        System.out.println("your width");
        return 0;
    }

    @Override
    public double getHeight() {
        System.out.println("your height");
        return 0;
    }
}
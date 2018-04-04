package classworks.march2018.mar222018.classwork.task4;

public class GenericsRunner {
    public static void main(String[] args) {
        GenericsExample2<Integer, String> example2;
        example2 = new GenericsExample2<>(55, "New string");
        example2.showTypes();
        int value = example2.getObject1();
        System.out.println(value);
        String str = example2.getObject2();
        System.out.println(str);
    }
}
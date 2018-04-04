package classworks.march2018.mar222018.classwork.task3;

public class GenericsRunner {
    public static void main(String[] args) {
        GenericsExample<Integer> integerExample;
        GenericsExample<String> stringExample;

        integerExample = new GenericsExample<>(55);
        integerExample.showType();
        int value = integerExample.getObject();
        System.out.println("Value = " + value);

        stringExample = new GenericsExample<>("Our string");
        stringExample.showType();
        String s = stringExample.getObject();
        System.out.println("String = " + s);
    }
}
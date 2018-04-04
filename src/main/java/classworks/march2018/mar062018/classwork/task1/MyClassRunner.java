package classworks.march2018.mar062018.classwork.task1;

public class MyClassRunner {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("1");
        MyClass myClass1 = new MyClass("2");

        MyClass.changeField(myClass);
        MyClass.changeRef(myClass1);

        System.out.println(myClass.s);
        System.out.println(myClass1.s);
    }
}
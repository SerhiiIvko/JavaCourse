package classworks.march2018.mar062018.classwork.task1;

public class MyClass {
    String s;

    public MyClass(String s) {
        this.s = s;
    }

    public static void changeField(MyClass other) {
        other.s = "=====";
    }

    static void changeRef(MyClass other) {
        other = new MyClass("------");
    }
}
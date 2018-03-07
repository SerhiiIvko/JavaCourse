package classworks.mar062018.classwork.task1;

public class MyClass {
    String s;

    public MyClass(String s) {
        this.s = s;
    }

    static void change(MyClass other) {
        other.s = "=====";
    }

    static void change2(MyClass other) {
        other = new MyClass("------");
    }
}

class Runner {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("1");
        MyClass myClass1 = new MyClass("2");

        MyClass.change(myClass);
        MyClass.change2(myClass1);

        System.out.println(myClass.s);
        System.out.println(myClass1.s);
    }
}
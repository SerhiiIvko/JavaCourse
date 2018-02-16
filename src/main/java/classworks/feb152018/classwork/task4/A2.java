package classworks.feb152018.classwork.task4;

public class A2 {
    private int a;
    private int a1;
    protected int a2;
    static int a3;

    private void method1() {
        a = 0;
        System.out.println(a);
    }

    private void method2() {
        a = 2;
    }

    protected void method3() {
        a = a + 2;
    }

    static void method4() {

    }

    public static void main(String[] args) {
        foo();
    }

    public static int foo() {
        return foo();

    }
}
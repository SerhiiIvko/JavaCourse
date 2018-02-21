package classworks.feb202018.classwork.task2;

public class FirstRecurcion {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int arg) {
        System.out.println(" " + arg);
        if (arg < 10) {
            f(arg + 1);
        }
        System.out.println(" " + arg);
    }
}
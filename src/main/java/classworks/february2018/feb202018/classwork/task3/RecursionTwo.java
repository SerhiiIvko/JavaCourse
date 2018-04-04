package classworks.february2018.feb202018.classwork.task3;

public class RecursionTwo {
    public static void main(String[] args) {
        a(3);
    }

    private static void a(int a) {
        System.out.println("1");
        b();
        System.out.println("2");
    }

    private static void b() {
        System.out.println("3");
        c();
        System.out.println("4");
    }

    private static void c() {
        System.out.println("5");
        return;
    }
}
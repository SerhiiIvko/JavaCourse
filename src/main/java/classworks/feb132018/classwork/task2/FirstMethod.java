package classworks.feb132018.classwork.task2;

public class FirstMethod {

    public static void main(String[] args) {
        System.out.println(getSum(5, 8));
        hello();
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void hello() {
        System.out.println("Hello, world!");
    }
}
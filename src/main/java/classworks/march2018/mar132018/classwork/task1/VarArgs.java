package classworks.march2018.mar132018.classwork.task1;

public class VarArgs {
    static void varArgTest(int... v) {
        System.out.println("Count args" + v.length);
        System.out.println("Contain: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg" + i + ": " + v[i]);
        }
    }

    static void varArgTest(boolean... value) {
        System.out.println("Count args" + value.length);
        System.out.println("Contain: ");
        for (int i = 0; i < value.length; i++) {
            System.out.println("arg" + i + ": " + value[i]);
        }
    }

    public static void main(String[] args) {
        varArgTest(2);
        varArgTest(1);
        varArgTest(1, 2, 3, 4, 5);
        varArgTest(false, true);
    }
}
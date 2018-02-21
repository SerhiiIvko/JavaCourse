package classworks.feb202018.classwork.task4;

public class Fibonach {

    public static int getFibonach(int arg) {
        if (arg == 1 || arg == 2) {
            return 1;
        }
        return getFibonach(arg - 2) + getFibonach(arg - 1);
    }

    public static void main(String[] args) {
        System.out.println(getFibonach(8));
    }
}
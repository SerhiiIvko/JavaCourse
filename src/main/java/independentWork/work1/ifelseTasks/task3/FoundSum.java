package independentWork.work1.ifelseTasks.task3;

/**
 * Найти сумму только положительных из трех чисел
 */
public class FoundSum {
    public static void main(String[] args) {
        int a = 2;
        int b = -3;
        int c = -1;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println(a + b + c);
        } else if (a > 0 && b > 0 && c < 0) {
            System.out.println(a + b);
        } else if (a > 0 && b < 0 && c > 0) {
            System.out.println(a + c);
        } else if (a < 0 && b > 0 && c > 0) {
            System.out.println(b + c);
        } else {
            System.out.println("Input two or more positive numbers");
        }
    }
}

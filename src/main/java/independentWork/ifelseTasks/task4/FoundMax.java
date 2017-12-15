package independentWork.ifelseTasks.task4;

/**
 * Посчитать выражение макс(а*б*с, а+б+с)+3
 */
public class FoundMax {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 6;
        if ((a * b * c) > (a + b + c)) {
            System.out.println((a * b * c) + 3);
        } else {
            System.out.println((a + b + c) + 3);
        }
    }
}

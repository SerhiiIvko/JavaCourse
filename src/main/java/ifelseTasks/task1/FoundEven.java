package ifelseTasks.task1;

/**
 * Если а – четное посчитать а*б, иначе а+б
 */
public class FoundEven {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        if (a % 2 == 0) {
            System.out.println(a * b);
        } else {
            System.out.println(a + b);
        }
    }
}

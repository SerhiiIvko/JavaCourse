package loops.task3;

/**
 * Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного
 * подбора и метод бинарного поиска)
 */
public class Main {
    public static void main(String[] args) {
        int num = 64;
        int squareRoot;
        for (int i = 1; i < num; i++) {
            if (i * i == num) {
                squareRoot = i;
                System.out.println(squareRoot);
            }
        }
    }
}

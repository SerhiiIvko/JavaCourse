package loops.task1;

/**
 * Найти сумму четных чисел и их количество в диапазоне от 1 до 99
 */
public class Main {
    public static void main(String[] args) {
        int countEvens = 0;
        int sumEvens = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                countEvens++;
                sumEvens += i;
            }
        }
        System.out.println(countEvens);
        System.out.println(sumEvens);
    }
}

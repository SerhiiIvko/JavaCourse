package classworks.january2018.jan182018.task14;

/**
 * Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся в интервале, левая граница которого равна 100.
 */
public class DivisionForNineteen {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 1; i <= 15; i++) {
            if (number % 19 == 0) {
                System.out.println(number);
            } else {
                number += 19;
                System.out.println(i + ". " + number);
            }
        }
    }
}

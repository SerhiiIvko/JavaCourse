package classworks.jan182018.task13;

import java.util.Scanner;

/**
 * Дано натуральное число. Определить насколько максимальная цифра превышает минимальную.
 */
public class MaxMoreMin {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int max = number % 10;
        int min = number % 10;
        if (number > 0) {
            for (; number != 0; number /= 10) {
                if (number % 10 > max) {
                    max = number % 10;
                }
                if (number % 10 < min) {
                    min = number % 10;
                }
            }
            System.out.println("Максимальная цифра " + max + " больше минимальной цифры " + min + " на " + (max - min));
        } else {
            System.out.println("Incorrect input");
        }
    }
}

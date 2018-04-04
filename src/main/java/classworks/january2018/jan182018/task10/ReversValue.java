package classworks.january2018.jan182018.task10;

import java.util.Scanner;

/**
 * 10.Запросить у пользователя натуральное число n. Найти число получаемое при прочтении его цифр справа налево.
 */
public class ReversValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        long number = scanner.nextLong();
        long swapNumber = 0;
        scanner.close();
        long division = 10;
        if (number < 0) {
            System.out.println("Incorrect input, value is not natural");
            return;
        }
        if (number < 10) {
            swapNumber = number;
        } else {
            while ((number / division) >= 10) {
                division *= 10;
            }
            long tmp;
            while (number > 0) {
                tmp = (number % 10) * division;
                swapNumber += tmp;
                division /= 10;
                number /= 10;
            }
        }
        System.out.println("Swap number is " + swapNumber);
    }
}



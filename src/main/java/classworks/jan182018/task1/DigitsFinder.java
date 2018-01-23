package classworks.jan182018.task1;

import java.util.Scanner;

/**
 * 1.Определить количество цифр в введённом числе.
 */
public class DigitsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();
        int counter = 0;
        do {
            counter++;
        }
        while ((number /= 10) > 0);
        System.out.println(counter);
    }
}

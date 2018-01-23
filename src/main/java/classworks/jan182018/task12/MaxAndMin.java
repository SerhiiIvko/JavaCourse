package classworks.jan182018.task12;

import java.util.Scanner;

/**
 * 12.Дано натуральное число. Определить максимальную и минимальную цифру.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("Input number");
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
            System.out.println(max + " is max and " + min + " is min");
        } else {
            System.out.println("Incorrect input");
        }
    }
}

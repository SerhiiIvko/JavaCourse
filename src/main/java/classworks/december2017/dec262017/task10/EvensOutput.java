package classworks.december2017.dec262017.task10;

import java.util.Scanner;

/**
 * 9.Даны 3 целых числа. Вывести на экран те из них, которые являются четными.
 */
public class EvensOutput {
    public static void main(String[] args) {
        System.out.println("Input 3 digits");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();

        if (number1 % 2 == 0) {
            System.out.println(number1);
        }
        if (number2 % 2 == 0) {
            System.out.println(number2);
        }
        if (number3 % 2 == 0) {
            System.out.println(number3);
        }
    }
}

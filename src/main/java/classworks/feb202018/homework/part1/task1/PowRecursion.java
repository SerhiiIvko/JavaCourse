package classworks.feb202018.homework.part1.task1;

import java.util.Scanner;

/**
 * Написать рекурсивную функцию для расчета степени n вещественного числа a (n – натуральное число).
 */
public class PowRecursion {
    public static int getPow(int number, int pow) {
        return ((pow == 0 || number == 1) ? 1 : (number * getPow(number, pow - 1)));
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only natural positive digits!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Negative numbers are not allowed!");
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readNumber(scanner, "Input number");
        int pow = readNumber(scanner, "Input pow");
        System.out.println(getPow(number, pow));
    }
}
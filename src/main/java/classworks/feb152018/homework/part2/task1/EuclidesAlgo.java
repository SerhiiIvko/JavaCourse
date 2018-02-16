package classworks.feb152018.homework.part2.task1;

import java.util.Scanner;

/**
 * Даны натуральные числа a и b. Найти их наименьшее общее кратное. (Определить метод для расчета наибольшего общего
 * делителя двух натуральных чисел, используя алгоритм Евклида.)
 */
public class EuclidesAlgo {
    static long getMinDivisions(long number1, long number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
            if (number2 == 0) {
                return Math.abs(number1);
            }
        }
        return (number1 * number2) / number1;
    }

    static long getLeastCommonMultiply(long number1, long number2) {
        return number1 / getMinDivisions(number1, number2) * number2;
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
        System.out.println("Input two positive numbers.");
        Scanner scanner = new Scanner(System.in);
        int number1 = readNumber(scanner, "First number: ");
        int number2 = readNumber(scanner, "Second number: ");
        scanner.close();
        System.out.println("Least common multiple is " + getLeastCommonMultiply(number1, number2));
    }
}
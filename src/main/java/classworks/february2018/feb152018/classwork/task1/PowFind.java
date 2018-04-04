package classworks.february2018.feb152018.classwork.task1;

import java.util.Scanner;

/**
 * Find pow
 */
public class PowFind {
    public static long calculatePow(int number, int pow) {
        int result = 1;
        for (int i = 0; i < pow; ++i) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readNumber(scanner, "Number");
        int pow = readNumber(scanner, "Pow");
        scanner.close();
        System.out.println(calculatePow(number, pow));
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            while (!scanner.hasNextInt()) {
                System.out.println("Input only natural digits!");
                scanner.next();
            }
            number = scanner.nextInt();
        }
        return number;
    }
}
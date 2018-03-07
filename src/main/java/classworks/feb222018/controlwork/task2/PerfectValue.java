package classworks.feb222018.controlwork.task2;

import java.util.Scanner;

/**
 * число называется совершенным, если сумма всех его делителей равна ему самому. написать метод поиска таких чисел во
 * введённом интервале.
 */
public class PerfectValue {
    public static void isPerfectValue(int value) {
        int p = 0;
        for (int i = 3; i <= 500; i++) {
            value = i;
            for (int j = 1; j < value; j++) {
                if (value % j == 0)
                    p += j;
            }
            if (p == i)
                System.out.println("Value " + i + " is perfect");
            p = 0;
        }
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Number must be positive!");
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = readNumber(scanner, "Input value");
        scanner.close();
        isPerfectValue(value);
    }
}
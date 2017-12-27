package classworks.dec262017.task2;

import java.util.Scanner;

/**
 * 1.Дано натуральное число. Определить:
 * a.Является ли оно четным
 * b.Оканчивается ли оно цифрой 7
 */
public class EvenAndSeven {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else if (number % 10 == 7) {
            System.out.println("Number contain '7'");
        } else {
            System.out.println("Number is not answer to conditions");
        }
    }
}

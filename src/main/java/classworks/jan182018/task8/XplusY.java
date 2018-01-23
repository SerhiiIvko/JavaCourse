package classworks.jan182018.task8;

import java.util.Scanner;

/**
 * Даны натуральные числа x и y. Вычислить произведение x y, используя лишь оператор сложения.
 */
public class XplusY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        scanner.close();
        long result = x;
        if (x > 0 && y > 0) {
            for (int i = 1; i < y; i++) {
                result += x;
            }
            System.out.println(x + " * " + y + " = " + result);
        } else {
            System.out.println("Incorrect input");
        }

    }
}

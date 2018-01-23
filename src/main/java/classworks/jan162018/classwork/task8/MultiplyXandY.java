package classworks.jan162018.classwork.task8;

import java.util.Scanner;

/**
 * Даны натуральный числа x и y. Вычислить произведение xy, используя лишь оператор сложения.
 */
public class MultiplyXandY {
    public static void main(String[] args) {
        System.out.println("Input x and y");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int result = 0;
        for (int i = 1; i <= y; i++) {
            result += x;
        }
        System.out.println(result);
    }
}

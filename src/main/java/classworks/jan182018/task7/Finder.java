package classworks.jan182018.task7;

import java.util.Scanner;

/**
 * 7.Найти:
 * a.Произведение всех чисел от 8 до 15.
 * b.Произведение всех чисел от a до 20 (значение a вводится с клавиатуры; 1 <= a <= 20)
 * c.Произведение всех чисел от 1 до b (значение b вводится с клавиатуры; 1 <= b <= 20)
 */
public class Finder {
    public static void main(String[] args) {
        System.out.println("1. Произведение всех чисел от 8 до 15.");
        int x = 15;
        long mult = 1;
        for (int i = 8; i <= x; i++) {
            mult *= i;
        }
        System.out.println("Произведение всех чисел от 8 до 15 = " + mult);

        System.out.println("2. Произведение всех чисел от a до 20 (значение a вводится с клавиатуры; 1 <= a <= 20)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();

        if (a >= 1 && a <= 20) {
            int b = 20;
            long multAtoB = 1;
            for (int i = a; i <= b; i++) {
                multAtoB *= i;
            }
            System.out.println("Произведение всех чисел от a до 20 = " + multAtoB);
        } else {
            System.out.println("Incorrect input");
        }
        System.out.println("3. Произведение всех чисел от 1 до b (значение b вводится с клавиатуры; 1 <= b <= 20)");
        System.out.println("Input b: ");
        int b = scanner.nextInt();
        scanner.close();
        if (b >= 1 && b <= 20) {
            long multAtoB = 1;
            for (int i = 1; i <= b; i++) {
                multAtoB *= i;
            }
            System.out.println("Произведение всех чисел от 1 до b = " + multAtoB);
        } else {
            System.out.println("Incorrect input");
        }
    }
}

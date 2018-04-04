package classworks.january2018.jan182018.task4;

import java.util.Scanner;

/**
 * 4.Напечатать таблицу умножения на число n (значение n вводится с клавиатуры 1 <= n <= 9)
 */
public class MultyN {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number >= 1 && number <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.println(i + " * " + number + " = " + i * number);
            }
        } else {
            System.out.println("Incorrect input");
        }
    }
}

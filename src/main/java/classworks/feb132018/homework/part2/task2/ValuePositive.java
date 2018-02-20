package classworks.feb132018.homework.part2.task2;

import java.util.Scanner;

/**
 * Написать функцию, которая возвращает истину, если передаваемое значение положительное и ложь, если отрицательное.
 */
public class ValuePositive {
    public static boolean isValuePositive(int value) {
        return (value >= 0);
    }

    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        System.out.println(isValuePositive(value));
    }
}
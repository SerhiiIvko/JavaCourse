package homeworks.module2part1.task4;

import java.util.Scanner;

/**
 * Задание 5. Записать следующие выражения (используя Java  операторы и класс Math).
 * Значение переменных a, b, c запросить у юзера.
 */
public class ClassMath {
    public static void main(String[] args) {
        System.out.println("Input values of a, b and c please: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
        double result1;
        double result2;

        result1 = ((1 / a) - b) / (2 / c);
        result2 = 1 / ((a + b) / 2) + 1;

        System.out.println("First result is " + result1);
        System.out.println("Second result is " + result2);
    }
}

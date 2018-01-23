package classworks.jan162018.classwork.task10;

import java.util.Scanner;

/**
 * 10.Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов. Числа Фибоначчи – это элементы числовой
 * последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
 */
public class Fibonach {
    public static void main(String[] args) {
        System.out.println("Input n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i < n; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}

package classworks.jan162018.classwork.task7;

import java.util.Scanner;

/**
 * 7.Найти:
 * a.Сумму всех чисел от 100 до 500;
 * b.Сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры a <= 500);
 * c.Сумму всех четных чисел от a до b (значение a и b вводится с клавиатуры b >= a);
 * d.Среднее арифметическое всех целых чисел от a до b (значение a и b вводится с клавиатуры b >= 100);
 */
public class ValuesFinder {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 501; i++) {
            sum = sum + i;
        }
        System.out.println("sum of values from 100 to 500 is " + sum);

        System.out.println("Input number not more 500");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumInNumber = 0;
        if (number <= 500) {
            for (int i = number; i < 501; i++) {
                sumInNumber = sumInNumber + i;
            }
            System.out.println(sumInNumber);
        } else {
            System.out.println("Incorrect input");
        }

        System.out.println("Input a and b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumEvensFromAtoB = 0;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    sumEvensFromAtoB = sumEvensFromAtoB + i;
                }
            }
            System.out.println(sumEvensFromAtoB);
        } else {
            System.out.println("Incorrect input");
        }

        System.out.println("Input number a and number b");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        scanner.close();
        double averageInAtoB = 0;
        if (numberB >= 100) {
            for (int i = Math.abs(numberA); i <= Math.abs(numberB); i++) {
                averageInAtoB = averageInAtoB + i;
            }
            if (numberA > numberB) {
                for (int i = Math.abs(numberB); i <= Math.abs(numberA); i++) {
                    averageInAtoB = averageInAtoB + i;
                }
            }
            averageInAtoB = averageInAtoB / (Math.abs(numberB - numberA) + 1);
            System.out.println(averageInAtoB);
        } else {
            System.out.println("Incorrect input");
        }
    }
}

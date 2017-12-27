package classworks.dec262017.task6;

import java.util.Scanner;

/**
 * 5.Пользователь вводит любое целое число (0-999). Определить:
 * a.Сколько цифр в числе (вывести результат)
 * b.Положительное или отрицательное число
 */
public class FindHowMuch {
    public static void main(String[] args) {
        System.out.println("Input 3-digits value");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        if (number < 0 && number > 999) {
            System.out.println("Incorrect input");
            return;
        }
        if (number / 100 > 0) {
            System.out.println("Number have 3 digits");
        } else if (number / 10 > 0) {
            System.out.println("Number have 2 digits");
        } else {
            System.out.println("Number have 1 digit");
        }

        System.out.println(number2 >= 0 ? number2 + " is positive" : number2 + " is negative");
    }
}

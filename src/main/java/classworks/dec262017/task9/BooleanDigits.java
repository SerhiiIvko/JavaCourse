package classworks.dec262017.task9;

import java.util.Scanner;

/**
 * 8.Дано трехзначное число. Определить:
 * a.Верно ли, что его цифры одинаковые?
 * b.Определить, есть ли среди его цифр одинаковые.
 */
public class BooleanDigits {
    public static void main(String[] args) {
        System.out.println("Input 3-digits value");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int last = number % 10;
        number = number / 10;
        int second = number % 10;
        number = number / 10;
        int first = number % 10;

        if (number < 100 && number > 999) {
            System.out.println("Incorrect input");
            return;
        }

        if (last == second && last == first) {
            System.out.println("Все цифры числа равны");
        } else {
            System.out.println("Не все цифры числа равны");
        }

        if (last == first || last == second || first == second) {
            System.out.println("Число содержит одинаковые цифры");
        } else {
            System.out.println("Одинаковых цифр в числе нет!");
        }
    }
}

package classworks.december2017.dec262017.task5;

import java.util.Scanner;

/**
 * 4.Дано трехзначное число. Определить какая из его цифр больше:
 * a.Первая или последняя
 * b.Первая или вторая
 * c.Вторая или последняя
 */
public class BiggerValue {
    public static void main(String[] args) {
        System.out.println("Input 3-digits value");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number < 100 && number > 999) {
            System.out.println("Incorrect input");
            return;
        }

        int last = number % 10;
        number = number / 10;
        int second = number % 10;
        number = number / 10;
        int first = number % 10;

        if (last > first) {
            System.out.println(last + " bigger " + first);
        } else if (last > second) {
            System.out.println(last + " bigger " + second);
        } else if (second > first) {
            System.out.println(second + " bigger " + first);
        } else {
            System.out.println(first + " bigger " + second + " and " + last);
        }
    }
}

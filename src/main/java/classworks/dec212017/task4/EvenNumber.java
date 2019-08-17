package classworks.dec212017.task4;

import java.util.Scanner;

/**
 * Запрашиваем число у юзера. Проверяем является ли целое число записанное в переменную number
 * четным или нечетным. Выводим информацию в консоль
 */

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Input number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else if (number == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Number is not even");
        }
    }
}

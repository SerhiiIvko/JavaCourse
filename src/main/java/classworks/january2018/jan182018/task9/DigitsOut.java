package classworks.january2018.jan182018.task9;

import java.util.Scanner;

/**
 * 9.Запросить у пользователя натуральное число n. Вывести в консоль все его цифры через пробел.
 */
public class DigitsOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        long number = scanner.nextLong();
        scanner.close();

        long division = 10;
        while ((number / division) >= 10) {
            division *= 10;
        }
        long tmp;
        if (number > 0) {
            do {
                tmp = number / division;
                number -= (tmp * division);
                division /= 10;
                System.out.print(tmp + " ");
            }
            while (division > 0);
        } else {
            System.out.println("Incorrect input");
        }
    }
}
package classworks.dec262017.task8;

import java.util.Scanner;

/**
 * 7.Дан отрезок от 0 до 100, который разделён на 4 сектора (A, B, C, D). Пользователь вводит число. Определить
 * на каком отрезке, в каком секторе, находится число:
 * A - [0; 25)
 * B – [25; 50)
 * C – [50; 75)
 * D – [75; 100]
 */
public class SectorFind {
    public static void main(String[] args) {
        System.out.println("Input 3-digits value");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 && number > 100) {
            System.out.println("Incorrect input");
            return;
        }

        if (number >= 0 && number < 25) {
            System.out.println("Sector A");
        } else if (number >= 25 && number < 50) {
            System.out.println("Sector B");
        } else if (number >= 50 && number < 75) {
            System.out.println("Sector C");
        } else {
            System.out.println("Sector D");
        }
    }
}

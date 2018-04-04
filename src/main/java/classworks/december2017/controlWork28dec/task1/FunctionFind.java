package classworks.december2017.controlWork28dec.task1;

import java.util.Scanner;

/**
 * 1.Составить программу:
 * a.вычисления значения функции z = x3 - 2,5xy + 1,78x2 – 2,5y +1, при любых значениях x и y (запрашиваем у
 * пользователя).
 * b.вычисления значения функции x = 3,56(a + b)3 – 5,8b2 + 3,8a -1,5 при любых значениях x и y (запрашиваем у
 * пользователя).
 */
public class FunctionFind {
    public static void main(String[] args) {
        System.out.println("Input X and Y value");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        double functionZ;
        double functionX;

        functionZ = (Math.pow(x, 3)) - (2.5 * x * y) + (1.78 * Math.pow(x, 2)) - (2.5 * y) + 1;
        functionX = 3.56 * Math.pow(x + y, 3) - (5.8 * Math.pow(y, 2)) + (3.8 * x) - 1.5;

        System.out.println("functionX = " + functionZ);
        System.out.println("functionY = " + functionX);
    }
}

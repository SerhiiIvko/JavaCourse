package classworks.february2018.feb132018.homework.part2.task1;

import java.util.Scanner;

/**
 * Реализовать 4 метода на простейшие арифметические операции (+,-,*,/).
 * Каждый метод должен принимать два вещественных числа и возвращать результат операции в виде вещественного числа.
 * Добавьте меню, в котором пользователь может выбрать желаемую операцию.
 */
public class Calculator {
    public static double getSum(double a, double b) {
        return a + b;
    }

    public static double getDifference(double a, double b) {
        return a - b;
    }

    public static double getMultiply(double a, double b) {
        return a * b;
    }

    public static double getDivision(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Input two numbers for calculation:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = scanner.nextDouble();
        System.out.println("Input b");
        double b = scanner.nextDouble();
        System.out.println("Input code of operation: \n" +
                "'+' code 1\n" +
                "'-' code 2\n" +
                "'*' code 3\n" +
                "'/' code 4\n");
        int codeOperation = scanner.nextInt();
        scanner.close();
        switch (codeOperation) {
            case 1:
                System.out.println(getSum(a, b));
                break;
            case 2:
                System.out.println(getDifference(a, b));
                break;
            case 3:
                System.out.println(getMultiply(a, b));
                break;
            case 4:
                System.out.println(getDivision(a, b));
                break;
            default:
                System.out.println("Incorrect code of operation");
        }
    }
}
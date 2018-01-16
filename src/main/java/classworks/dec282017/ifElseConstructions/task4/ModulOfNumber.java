package classworks.dec282017.ifElseConstructions.task4;

import java.util.Scanner;

/**
 * 4.Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго
 * введенного числа по aбсолютной величине.
 */
public class ModulOfNumber {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        scanner.close();

        if (number1 == number2) {
            System.out.println("Values are equals");
        }

        double minuent;
        double subtracted;
        if (number1 < 0) {
            minuent = 0;
            subtracted = number1;
        } else {
            minuent = number1;
            subtracted = 0;
        }
        double difference1 = minuent - subtracted;

        if (number2 < 0) {
            minuent = 0;
            subtracted = number1;
        } else {
            minuent = number2;
            subtracted = 0;
        }
        double difference2 = minuent - subtracted;

        if (difference1 > difference2) {
            System.out.println(number1 / 2);
        } else {
            System.out.println("Condition is not valid for operation");
        }

    }
}

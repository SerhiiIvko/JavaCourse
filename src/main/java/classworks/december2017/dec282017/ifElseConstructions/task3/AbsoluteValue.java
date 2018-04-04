package classworks.december2017.dec282017.ifElseConstructions.task3;

import java.util.Scanner;

/**
 * 3.Дано вещественное число. Вывести на экран его абсолютную величину. Не используем другие класссы (например Math).
 */
public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        scanner.close();

        double minuent;
        double subtracted;
        if (number < 0) {
            minuent = 0;
            subtracted = number;
        } else {
            minuent = number;
            subtracted = 0;
        }
        double difference = minuent - subtracted;
        System.out.println(difference);
    }
}

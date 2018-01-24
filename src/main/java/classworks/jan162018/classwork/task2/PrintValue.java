package classworks.jan162018.classwork.task2;

import java.util.Scanner;

/**
 * 2.Составить программу вывода любое числа любое заданное число раз (запросить у пользователя) в виде, аналогичному выше.
 */
public class PrintValue {
    public static void main(String[] args) {
        System.out.println("Input value");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < value; i++) {
            System.out.print(value + " ");
        }
    }
}

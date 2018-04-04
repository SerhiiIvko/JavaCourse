package classworks.december2017.dec192017.module3.task2;

import java.util.Scanner;

/**
 * Created by ivko on 19.12.17.
 */
public class OutputOne {
    public static void main(String[] args) {
        System.out.println("Input value");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        int result1 = number1 % number2;
        int output = result1 + 1;
        int result2 = number1 / number2;

        System.out.println(output);
        System.out.println(result2);
    }
}

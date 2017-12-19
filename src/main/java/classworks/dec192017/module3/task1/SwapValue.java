package classworks.dec192017.module3.task1;

import java.util.Scanner;

/**
 * Created by ivko on 19.12.17.
 */
public class SwapValue {
    public static void main(String[] args) {
        System.out.println("Input 3-digits number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int firstNumber = number % 10;
        number = number / 10;
        int middle = number % 10;
        number = number / 10;

        int result = (firstNumber * 100) + (middle * 10) + number;

        System.out.println(result);
    }
}
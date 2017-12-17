package homeworks.module2part2.task1.task1part2;

import java.util.Scanner;

/**
 * Created by ivko on 15.12.17.
 */
public class NextFunction {
    public static void main(String[] args) {
        System.out.println("Input x value for get function: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double x;
        x = 12 * (Math.pow(a, 2)) + (7 * a) - 16;

        System.out.println("Function is " + x);
    }
}

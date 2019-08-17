package homeworks.module2part2.task1.task1part1;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        System.out.println("Input x value for get function: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        double y;
        y = 7 * (Math.pow(x, 2)) - (3 * x) + 6;

        System.out.println("Function of y is " + y);
    }
}

package classworks.feb202018.classwork.task5;

import java.util.Scanner;

public class Factorial {

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return (getFactorial(n - 1) * n);
    }

    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Factorial number " + number + " = " + getFactorial(number));
    }
}
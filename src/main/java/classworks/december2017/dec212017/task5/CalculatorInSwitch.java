package classworks.december2017.dec212017.task5;

import java.util.Scanner;

/**
 * Created by ivko on 21.12.17.
 */
public class CalculatorInSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = scanner.nextInt();
        System.out.println("Input second number");
        int num2 = scanner.nextInt();
        System.out.println("Input code of operations: + , - , * , / ");
        char operations = scanner.next().charAt(0);
        scanner.close();

        double result = 0;

        switch (operations) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!!!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Input correct code operation!");
        }
        System.out.println(result);
    }
}

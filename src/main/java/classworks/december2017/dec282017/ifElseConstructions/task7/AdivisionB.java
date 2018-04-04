package classworks.december2017.dec282017.ifElseConstructions.task7;

import java.util.Scanner;

/**
 * 7.Определить, верно ли, что при делении неотрицательного целого числа a на положительное число b  получается остаток,
 * равный одному из двух заданных чисел c или d.
 */
public class AdivisionB {
    public static void main(String[] args) {
        System.out.println("Input positive numbers a and b, also numbers c and d:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("Input correct value");
            return;
        }

        System.out.println(a % b == c || a % b == d ? "Yes, a % b = c or d" : "No");
    }
}

package classworks.january2018.jan182018.task11;

import java.util.Scanner;

/**
 * 11.Дано число n. Из чисел 1, 4, 7, 10, 13, ... (до заданного вами числа)  напечатать те, которые не превышают n.
 */
public class WhoIsMore {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int i = 1;
        if (n <= 0) {
            System.out.print("Incorrect input");
        }
        do {
            System.out.print(i + " ");
            i += 3;
        }
        while (i < n);

        for (int j = 1; j < n; ) {
            System.out.print(j + " ");
            j = j + 3;
        }
    }
}

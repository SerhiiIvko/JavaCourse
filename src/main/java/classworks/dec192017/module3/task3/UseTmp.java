package classworks.dec192017.module3.task3;

import java.util.Scanner;

/**
 * Created by ivko on 19.12.17.
 */
public class UseTmp {
    public static void main(String[] args) {
        System.out.println("input 3 values");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int tmp;

        tmp = c;
        c = b;
        b = a;
        a = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

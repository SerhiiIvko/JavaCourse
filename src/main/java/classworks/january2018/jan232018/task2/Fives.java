package classworks.january2018.jan232018.task2;

import java.util.Scanner;

public class Fives {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        final int rows = 4;
        final int columns = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
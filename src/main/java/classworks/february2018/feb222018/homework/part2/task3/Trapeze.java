package classworks.february2018.feb222018.homework.part2.task3;

import java.util.Scanner;

/**
 * Методы
 * Даны основания и высоты двух равнобедренных трапеций. Найти суму их периметров. (Определить функцию для расчета
 * периметра равнобедренной трапеции по её основаниям и высоте).
 */
public class Trapeze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upBase1 = readNumber(scanner, "Input up base of first trapeze");
        int downBase1 = readNumber(scanner, "Input down base of first trapeze");
        int h1 = readNumber(scanner, "Input high of first trapeze");
        int upBase2 = readNumber(scanner, "Input up base of second trapeze");
        int downBase2 = readNumber(scanner, "Input down base of second trapeze");
        int h2 = readNumber(scanner, "Input high of second trapeze");
        scanner.close();

        if (upBase1 == downBase1 || upBase2 == downBase2) {
            System.out.println("This figure is not trapeze! Incorrect input");
            return;
        }
        if (upBase1 > downBase1 || upBase2 > downBase2) {
            System.out.println("Upper base must be largest!");
            return;
        }

        System.out.println("Perimeter of first trapeze = " + getPerimeterTrapeze(upBase1, downBase1, h1));
        System.out.println("Perimeter of second trapeze = " + getPerimeterTrapeze(upBase2, downBase2, h2));
        System.out.println("Sum of perimeters = " + getPerimeterTrapeze(upBase1, downBase1, h1) +
                getPerimeterTrapeze(upBase2, downBase2, h2));
    }

    public static double getPerimeterTrapeze(int upBase, int downBase, int h) {
        double catheter = (downBase - upBase) / 2;
        double lateral = (Math.sqrt(Math.pow(h, 2) + Math.pow(catheter, 2)));
        return upBase + downBase + (lateral * 2);
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Value of side must be positive!");
                }
            }
        }
        return number;
    }
}
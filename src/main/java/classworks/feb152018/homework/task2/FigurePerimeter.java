package classworks.feb152018.homework.task2;

import java.util.Scanner;

/**
 * 2)Найти периметр фигуры по заданным сторонам AB, AC, и CD (см. рисунок)
 * Определить метод для расчета гипотенузы прямоугольного треугольника по его катетам.
 */
public class FigurePerimeter {
    public static double getPerimeter(double ab, double ac, double cd) {
        double bc = getHypotenuseLength(ab, ac);
        double db = getHypotenuseLength(bc, cd);
        return (ab + ac + cd + db);
    }

    public static double getHypotenuseLength(double firstCatheter, double secondCatheter) {
        return (Math.sqrt(Math.pow(firstCatheter, 2) + Math.pow(secondCatheter, 2)));
    }

    private static double readNumber(Scanner scanner, String inviteText) {
        double number = -1;
        System.out.println(inviteText);
        while (number < 0) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Input only natural positive digits!");
                scanner.next();
            } else {
                number = scanner.nextDouble();
                if (number < 0) {
                    System.out.println("Negative numbers are not allowed!");
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ab = readNumber(scanner, "Input first side of polygon: ");
        double ac = readNumber(scanner, "Input second side of polygon: ");
        double cd = readNumber(scanner, "Input third side of polygon: ");
        System.out.println("Perimeter of polygon is " + getPerimeter(ab, ac, cd));
    }
}
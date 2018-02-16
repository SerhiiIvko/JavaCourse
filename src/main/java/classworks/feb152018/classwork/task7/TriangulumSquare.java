package classworks.feb152018.classwork.task7;

import java.util.Scanner;

public class TriangulumSquare {
    static float getTriangulumSquare(double a, double b, double c) {
        double square = 0;
        double p = (a + b + c) / 2;
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println("Треугольник не существует");
        }
        return (float) square;
    }

    public static void main(String[] args) {
        System.out.println("input sides of triangulum: ");
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.println("Side A:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            }
            a = scanner.nextDouble();
            System.out.println("Side B:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            }
            b = scanner.nextDouble();
            System.out.println("Side C:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            }
            c = scanner.nextDouble();
        } while (a <= 0 || b <= 0 || c <= 0);
        scanner.close();
        System.out.println();
        float triangulumSquare = getTriangulumSquare(a, b, c);
        System.out.println("Square of triangulum " + triangulumSquare);
        System.out.println(String.format("%.3f", triangulumSquare));
    }
}
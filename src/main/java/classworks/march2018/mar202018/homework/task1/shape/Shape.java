package classworks.march2018.mar202018.homework.task1.shape;

import java.util.Scanner;

public abstract class Shape {

    public abstract double getArea();

    public abstract double getVolume();

    public static Shape create(ShapeType shapeType, Scanner scanner) {
        switch (shapeType) {
            case BLOCK:
                System.out.println("Введите параметры блока (длину, ширину, высоту):");
                return createBlock(scanner);
            case SPHERE:
                System.out.println("Введите параметры сферы (радиус):");
                return createSphere(scanner);
            case PYRAMID:
                System.out.println("Введите параметры пирамиды (длину, ширину, высоту):");
                return createPyramid(scanner);
        }
        throw new IllegalArgumentException();
    }

    private static Shape createBlock(Scanner scanner) {
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        return new Block(length, width, height);
    }

    private static Shape createSphere(Scanner scanner) {
        double radius = scanner.nextDouble();
        return new Sphere(radius);
    }

    private static Shape createPyramid(Scanner scanner) {
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        return new Pyramid(length, width, height);
    }
}
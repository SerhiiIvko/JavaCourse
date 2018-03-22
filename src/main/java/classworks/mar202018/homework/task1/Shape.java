package classworks.mar202018.homework.task1;

import java.util.Scanner;

public abstract class Shape {

    public abstract double getArea();

    public abstract double getVolume();

    public static Shape create(ShapeType shapeType, Scanner scanner) {
        switch (shapeType) {
            case BLOCK:
                System.out.println("Input parameters for block (length, width, height):");
                return createBlock(scanner);
            case SPHERE:
                System.out.println("Input parameters for sphere (radius):");
                return createSphere(scanner);
            case PYRAMID:
                System.out.println("Input parameters for pyramid (length, width, height):");
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
package classworks.mar202018.homework.task1;

import java.util.function.Function;

public class ShapeManager {
    public static final int MAX_SHAPES_NUMBER = 10;
    private Shape[] shapes;
    private int shapeCounter;

    public ShapeManager() {
        this.shapes = new Shape[MAX_SHAPES_NUMBER];
        this.shapeCounter = 0;
    }

    public void addShape(Shape shape) {
        if (shapeCounter < MAX_SHAPES_NUMBER) {
            shapes[shapeCounter++] = shape;
        }
    }

    public double getAverageArea() {
        return getAverageData(Shape::getArea);
    }

    public double getAverageVolume() {
        return getAverageData(Shape::getVolume);
    }

    private double getAverageData(Function<Shape, Double> function) {
        double sum = 0;
        for (int i = 0; i < shapeCounter; i++) {
            sum += function.apply(shapes[i]);
        }
        return sum / shapeCounter;
    }

    public void print() {
        for (int i = 0; i < shapeCounter; i++) {
            System.out.println(shapes[i].toString());
            System.out.println("Area of this shape = " + (float) shapes[i].getArea());
            System.out.println("Volume of this shape = " + (float) shapes[i].getVolume());
        }
        System.out.println("Average area of shapes = " + (float) getAverageArea());
        System.out.println("Average volume of shapes = " + (float) getAverageVolume());
    }
}
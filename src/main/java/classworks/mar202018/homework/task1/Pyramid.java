package classworks.mar202018.homework.task1;

public class Pyramid extends Shape {
    private double length;
    private double width;
    private double height;

    public Pyramid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double diagonal = getCatheter(length, width);
        double catheter = diagonal / 2;
        double corner = getCatheter(catheter, height);
        double apofema = getCatheter(corner, length / 2);
        return ((length * width) + (2 * (length / 2 * apofema)) + (2 * (width / 2 * apofema)));
    }

    private double getCatheter(double sideA, double sideB) {
        return Math.sqrt((Math.pow(sideA, 2) + (Math.pow(sideB, 2))));
    }

    @Override
    public double getVolume() {
        return (((length * width) * height) / 3);
    }

    @Override
    public String toString() {
        return "Pyramid parameters: " +
                "length = " + length +
                ", width = " + width +
                ", height = " + height;
    }
}
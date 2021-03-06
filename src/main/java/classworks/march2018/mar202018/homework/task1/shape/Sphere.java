package classworks.march2018.mar202018.homework.task1.shape;

public class Sphere extends Shape {
    private double radius;
    private final double PI = 3.14;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (float) 4 * PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (float) (4 / 3) * PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Параметры сферы: " +
                "радиус = " + radius;
    }
}
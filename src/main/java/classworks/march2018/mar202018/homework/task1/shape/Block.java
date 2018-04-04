package classworks.march2018.mar202018.homework.task1.shape;

public class Block extends Shape {
    private double length;
    private double width;
    private double height;

    public Block(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((length * width) * 2) + ((length * height) * 2) + ((width * height) * 2);
    }

    @Override
    public double getVolume() {
        return length * height * width;
    }

    @Override
    public String toString() {
        return "Параметры блока: " +
                "длина = " + length +
                ", ширина = " + width +
                ", высота = " + height;
    }
}
package classworks.mar132018.classwork.task2.construct;

public class ShapeConstructor {
    private double width;
    private double height;

    ShapeConstructor() {
        width = height = 0;
    }

    ShapeConstructor(double width, double height) {
        this.width = width;
        this.height = height;
    }

    ShapeConstructor(double x) {
        width = x;
        height = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Width and height " + width + ", " + height);
    }
}
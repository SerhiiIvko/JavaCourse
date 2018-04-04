package classworks.march2018.mar152018.classwork.task1.classes;

/**
 * superclass
 */
public class Shape {
    private double width;
    private double high;
    private String name;

    public Shape() {
        width = high = 0;
        name = "no name";
    }

    public Shape(double high, double width, String name) {
        this.high = high;
        this.width = width;
        this.name = name;
    }

    public Shape(Shape shape) {
        width = shape.width;
        high = shape.high;
        name = shape.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(double x) {

    }

    void showDimension() {
        System.out.println("Width and high " + width + ", " + high);
    }
}
package classworks.march2018.mar132018.classwork.task2.classes;

/**
 * superclass
 */
public class Shape {
    double width;
    double high;

    public Shape() {
        width = high = 0;
    }

    public Shape(double high, double width) {
        this.high = high;
        this.width = width;
    }

    public Shape(double x) {

    }

    void showDimension() {
        System.out.println("Width and high " + width + ", " + high);
    }
}
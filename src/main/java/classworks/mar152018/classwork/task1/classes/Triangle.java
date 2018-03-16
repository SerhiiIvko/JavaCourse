package classworks.mar152018.classwork.task1.classes;

/**
 * class child
 */
public class Triangle extends Shape {
    String style;

    public Triangle() {
        super();
        style = "no style";
    }

    Triangle(double x) {
        super(x);
        style = "colored";
    }

    double area() {
        return (getWidth() * getHigh()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
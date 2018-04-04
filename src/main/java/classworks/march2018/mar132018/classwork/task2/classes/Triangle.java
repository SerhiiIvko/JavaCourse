package classworks.march2018.mar132018.classwork.task2.classes;

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
        return (width * high) / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
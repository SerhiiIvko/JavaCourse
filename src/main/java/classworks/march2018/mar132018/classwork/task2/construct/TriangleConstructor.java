package classworks.march2018.mar132018.classwork.task2.construct;

public class TriangleConstructor extends ShapeConstructor {
    private String style;

    TriangleConstructor() {
        super();
        style = "no style";
    }

    TriangleConstructor(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    TriangleConstructor(double x) {
        super(x);
        style = "colored";
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
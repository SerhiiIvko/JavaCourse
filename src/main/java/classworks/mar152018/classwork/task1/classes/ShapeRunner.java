package classworks.mar152018.classwork.task1.classes;

/**
 * runner
 */
public class ShapeRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(5);
        Rectangle rectangle = new Rectangle();
        Shape[] shapes = new Shape[1];
        shapes[0] = new Shape();
        shapes[1] = new Rectangle();

        Shape shape1 = shapes[0];
        Shape shape2 = shapes[1];

        shape1.showDimension();
        shape2.showDimension();
        triangle.style = "black";

        triangle1.style = "contur";

        System.out.println("Information: ");
        triangle.showStyle();
        triangle.showDimension();
        System.out.println("Area triangle = " + triangle.area());

        System.out.println("Information: ");
        triangle1.showStyle();
        triangle1.showDimension();
        System.out.println("Area triangle1 = " + triangle1.area());

        System.out.println("Information: ");
        rectangle.isSquare();
        System.out.println("Area rectangle = " + rectangle.area());
    }
}
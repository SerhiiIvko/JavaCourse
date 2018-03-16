package classworks.mar132018.classwork.task2.classes;

/**
 * runner
 */
public class ShapeRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(5);
        Rectangle rectangle = new Rectangle();

        triangle.high = 4.0;
        triangle.width = 4.0;
        triangle.style = "black";

        triangle1.high = 12;
        triangle1.width = 20;
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
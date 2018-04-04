package classworks.march2018.mar132018.classwork.task2.classes;

/**
 * child class
 */
public class Rectangle extends Shape {
    boolean isSquare() {
        if (width == high) {
            return true;
        }
        return false;
    }

    double area() {
        return width * high;
    }
}
package classworks.mar152018.classwork.task1.classes;

/**
 * child class
 */
public class Rectangle extends Shape {
    boolean isSquare() {
        if (getWidth() == getHigh()) {
            return true;
        }
        return false;
    }

    double area() {
        return getWidth() * getHigh();
    }
}
package classworks.march2018.mar012018.classwork.task4;

public class Circle {
    public double x;
    public double y;
    public double r;

    public void printCircle() {
        System.out.println(" Circle with center in (" + x + "; " + y + ") and radius " + r);
    }

    public void zoomCircle(double k) {
        r = r * k;
    }
}
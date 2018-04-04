package classworks.march2018.mar012018.homework.part1.task1;

/**
 * 1)В примере с классом Circle выполнить:
 * Создайте в классе Circle метод, вычисляющий длину окружности.
 * Создайте в классе Circle метод, который будет перемещать центр окружности на заданное расстояние.
 * Создайте в классе Circle метод, вычисляющий площадь той окружности, к которой метод применён.
 */

public class Circle {
    double x;
    private double y;
    private double r;
    final static double PI = 3.14;

    public Circle(double x, double y, double r) {
        if (x > 0 && y > 0 && r > 0) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }

    public void printCircle() {
        System.out.println("Circle with center in (" + x + "; " + y + ") and radius " + r);
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

    public void circumference(double r) {
        System.out.println("Circumference of circle = " + (float) (2 * PI * r));
    }

    public void moveCenterOfCircle(double x, double y) {
        System.out.println("Center of circle moved to (" + (x + 5) + "; " + (y + 5) + ")");
    }

    public void squareOfCircle(double r) {
        System.out.println("Rectangle of circle = " + (float) (PI * (Math.pow(r, 2))));
    }
}
package classworks.mar012018.homework.part1.task3;

/**
 * Создайте класс прямоугольных треугольников, описав в нём все необходимые свойства, подобрав им понятные имена и
 * правильные типы данных.
 * Создайте в классе метод, проверяющий являются ли два треугольника подобными.
 */
public class RightAngleTriangle {
    private double firstCatheter;
    private double secondCatheter;

    public RightAngleTriangle(double firstCatheter, double secondCatheter) {
        if (firstCatheter > 0 && secondCatheter > 0) {
            this.firstCatheter = firstCatheter;
            this.secondCatheter = secondCatheter;
        }
    }

    public boolean isSimilar(RightAngleTriangle that) {
        return this.firstCatheter / this.secondCatheter == that.firstCatheter / that.secondCatheter;
    }
}
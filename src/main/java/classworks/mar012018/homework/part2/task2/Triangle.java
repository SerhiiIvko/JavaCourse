package classworks.mar012018.homework.part2.task2;

/**
 * Создайте класс прямоугольных треугольников, описав в нём все необходимые свойства, подобрав им понятные имена и
 * правильные типы данных.
 * Создайте в классе метод, вычисляющий длину высоты, опущенной на гипотенузу.
 */
public class Triangle {
    private double firstCatheter;
    private double secondCatheter;

    Triangle(double firstCatheter, double secondCatheter) {
        if (firstCatheter > 0 && secondCatheter > 0) {
            this.firstCatheter = firstCatheter;
            this.secondCatheter = secondCatheter;
        } else {
            System.out.println("Incorrect data");
        }
    }

    public double getHight() {
        return (firstCatheter * secondCatheter) / Math.sqrt(Math.pow(firstCatheter, 2) +
                Math.pow(secondCatheter, 2));
    }
}
package classworks.mar012018.homework.part2.task1;

/**
 * Создайте класс прямоугольников, описав в нём все необходимые свойства, подобрав им понятные имена и правильные
 * типы данных.
 * Создайте в классе метод, проверяющий равны ли два прямоугольника по площади.
 */
public class Rectangle {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        if (sideA > 0 && sideB > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            System.out.println("Incorrect data");
        }
    }

    public boolean isSquareEquals(Rectangle that) {
        return (this.sideA * this.sideB) == (that.sideA * that.sideB);
    }
}
package classworks.feb152018.homework.task2;

/**
 * 2)Найти периметр фигуры по заданным сторонам AB, AC, и CD (см. рисунок)
 * Определить метод для расчета гипотенузы прямоугольного треугольника по его катетам.
 */
public class FigurePerimeter {
    public static double getPerimeter(double ab, double ac, double cd) {
        double bc = getHypotenuseLength(ab, ac);
        double db = getHypotenuseLength(bc, cd);
        return (ab + ac + cd + db);
    }

    public static double getHypotenuseLength(double firstCatheter, double secondCatheter) {
        return (Math.sqrt(Math.pow(firstCatheter, 2) + Math.pow(secondCatheter, 2)));
    }

    public static void main(String[] args) {
        System.out.println("Perimeter of polygon is " + getPerimeter(3, 4, 5));
    }
}
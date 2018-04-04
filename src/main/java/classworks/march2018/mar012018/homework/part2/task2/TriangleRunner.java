package classworks.march2018.mar012018.homework.part2.task2;

/**
 * С использованием построенного класса создайте треугольник с катетами 3 и 4. Вычислите с помощью метода и выведите на
 * экран длину высоты, опущенной на гипотенузу.
 */
public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4);
        double high = triangle.getHight();
        System.out.println(high);
    }
}
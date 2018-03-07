package classworks.mar012018.homework.part1.task3;

/**
 * С использованием построенного класса создайте два треугольника: один с катетами 3 и 4 и второй с катетами 5 и 6.
 * Проверьте с помощью созданного метода подобны ли треугольники и если да, то выведите соответствующее сообщение на экран.
 */
public class TrianglesRunner {
    public static void main(String[] args) {
        RightAngleTriangle triangle1 = new RightAngleTriangle(3, 4);
        RightAngleTriangle triangle2 = new RightAngleTriangle(5, 6);

        boolean similar = triangle1.isSimilar(triangle2);
        System.out.println(String.format("Triangles are%s similar", similar ? "" : "n't"));
    }
}
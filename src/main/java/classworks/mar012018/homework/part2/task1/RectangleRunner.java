package classworks.mar012018.homework.part2.task1;

/**
 * С использованием построенного класса создайте один прямоугольник со сторонами 3 и 8 и второй прямоугольник со сторонами
 * 6 и 4. Проверьте с помощью созданного метода равны ли прямоугольники по площади и если да, то выведите соответствующее
 * сообщение на экран.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 8);
        Rectangle rectangle2 = new Rectangle(6, 4);

        boolean isSquareEquals = rectangle1.isSquareEquals(rectangle2);

        System.out.println(String.format("Rectangles square are%s equals", isSquareEquals ? "" : "n't"));
    }
}
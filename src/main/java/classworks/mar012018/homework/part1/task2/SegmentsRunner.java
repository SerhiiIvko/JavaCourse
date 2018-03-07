package classworks.mar012018.homework.part1.task2;

/**
 * С использованием построенного класса создайте два отрезка: один от точки (1;1) до точки (2;2) и второй отрезок от точки
 * (-3;0) до точки (1;1). Проверьте с помощью созданного метода равна ли их длина и если равна, то выведите соответствующее
 * сообщение на экран.
 */
public class SegmentsRunner {
    public static void main(String[] args) {
        Segments segment1 = new Segments(1, 1, 2, 2);
        Segments segment2 = new Segments(-3, 0, 1, 1);

        boolean equals = segment1.isSegmentEquals(segment2);
        System.out.println(String.format("Segments are%s equals", equals ? "" : "n't"));
    }
}
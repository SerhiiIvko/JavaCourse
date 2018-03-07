package classworks.mar012018.homework.part1.task2;

/**
 * Создайте класс отрезков на координатной плоскости, описав в нём все необходимые свойства, подобрав им понятные имена
 * и правильные типы данных.
 * Создайте в классе метод, проверяющий равна ли длина двух отрезков.
 */
public class Segments {
    private double xSegmentStart;
    private double xSegmentEnd;
    private double ySegmentStart;
    private double ySegmentEnd;

    public Segments(double xSegmentStart, double xSegmentEnd, double ySegmentStart, double ySegmentEnd) {
        this.xSegmentStart = xSegmentStart;
        this.xSegmentEnd = xSegmentEnd;
        this.ySegmentStart = ySegmentStart;
        this.ySegmentEnd = ySegmentEnd;
    }

    public boolean isSegmentEquals(Segments segments) {
        return (Math.sqrt((Math.pow((this.xSegmentEnd - this.xSegmentStart), 2)) +
                (Math.pow((this.ySegmentEnd - this.ySegmentStart), 2)))) ==
                (Math.sqrt((Math.pow((segments.xSegmentEnd - segments.xSegmentStart), 2)) +
                        (Math.pow((segments.ySegmentEnd - segments.ySegmentStart), 2))));
    }
}
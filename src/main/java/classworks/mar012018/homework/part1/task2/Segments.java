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
        return getLenghtSegment() ==
                (segments.getLenghtSegment());
    }

    private double getLenghtSegment() {
        return Math.sqrt(getPow((this.xSegmentEnd - this.xSegmentStart)) +
                (getPow(this.ySegmentEnd - this.ySegmentStart)));
    }

    private double getPow(double a) {
        return Math.pow(a, 2);
    }
}
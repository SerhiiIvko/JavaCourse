package classworks.mar012018.classwork.task4;

public class CircleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        circle1.printCircle();
        circle1.x = 3;
        circle1.r = 12.3;
        circle1.printCircle();

        circle2.printCircle();
        circle2.r = 3.14;
        circle2.zoomCircle(1.66);
        circle2.printCircle();
    }
}
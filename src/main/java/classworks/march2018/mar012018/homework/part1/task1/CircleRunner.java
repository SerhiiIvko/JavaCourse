package classworks.march2018.mar012018.homework.part1.task1;

public class CircleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 12.3);
        Circle circle2 = new Circle(0, 0, 3.14);

        circle1.printCircle();
        circle1.x = 3;
        circle1.printCircle();

        circle2.printCircle();
        circle2.zoomCircle(1.66);
        circle2.printCircle();

        circle1.circumference(5);
        circle2.moveCenterOfCircle(2, 3);
        circle1.squareOfCircle(5);
    }
}
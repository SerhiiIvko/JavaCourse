package classworks.march2018.mar132018.classwork.task2.construct;

public class ColorTriangleConstructor extends TriangleConstructor {
    private String color;

    public ColorTriangleConstructor(String style, double width, double height, String color) {
        super(style, width, height);
        this.color = color;
    }

    void showColor() {
        System.out.println("Color is " + color);
    }
}
package classworks.march2018.mar132018.classwork.task2.construct;

public class ConstructorRunner {
    public static void main(String[] args) {
        TriangleConstructor constructor1 = new TriangleConstructor();
        TriangleConstructor constructor2 = new TriangleConstructor("not colored", 53, 45);
        TriangleConstructor constructor3 = new TriangleConstructor(5.0);
        ColorTriangleConstructor colorTrConstr = new ColorTriangleConstructor("colored", 20, 25, "white");
        ColorTriangleConstructor colorTrConstr2 = new ColorTriangleConstructor("colored", 5, 6, "black");

        System.out.println("Triangle first info:");
        constructor1.showStyle();
        constructor1.showDim();
        System.out.println("Area = " + constructor1.area());

        System.out.println("Triangle second info:");
        constructor2.showStyle();
        System.out.println("Area = " + constructor2.area());

        System.out.println("Triangle second info:");
        System.out.println("Area = " + constructor3.area());

        System.out.println("Next classes info:");
        colorTrConstr.showColor();
        System.out.println(colorTrConstr2.area());
        colorTrConstr2.showColor();
        colorTrConstr2.showStyle();
    }
}
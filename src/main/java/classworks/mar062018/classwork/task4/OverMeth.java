package classworks.mar062018.classwork.task4;

public class OverMeth {

    void ovDemo() {
        System.out.println("No param");
    }

    void ovDemo(int a) {
        System.out.println("One param = " + a);
    }

    int ovDemo(int a, int b) {
        System.out.println("Two param " + a + " + " + b + " = ");
        return a + b;
    }

    double ovDemo(double a, double b) {
        System.out.println("Two double param " + a + " + " + b + " = ");
        return a + b;
    }
}
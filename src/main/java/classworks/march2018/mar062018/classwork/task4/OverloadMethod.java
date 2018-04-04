package classworks.march2018.mar062018.classwork.task4;

public class OverloadMethod {
    void overloadDemonstrationMethod() {
        System.out.println("No param");
    }

    void overloadDemonstrationMethod(int a) {
        System.out.println("One param = " + a);
    }

    int overloadDemonstrationMethod(int a, int b) {
        System.out.print("Two param " + a + " + " + b + " = ");
        return a + b;
    }

    double overloadDemonstrationMethod(double a, double b) {
        System.out.print("Two double param " + a + " + " + b + " = ");
        return a + b;
    }
}
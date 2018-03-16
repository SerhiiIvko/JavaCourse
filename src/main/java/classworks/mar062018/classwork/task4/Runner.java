package classworks.mar062018.classwork.task4;

public class Runner {
    public static void main(String[] args) {
        OverloadMethod method = new OverloadMethod();
        int resInt;
        double resDouble;
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 11;
        float f = 11.5f;

        method.overloadDemonstrationMethod();
        method.overloadDemonstrationMethod(i);
        resInt = method.overloadDemonstrationMethod(2, 3);
        System.out.println();
        System.out.println("Int result = " + resInt);
        System.out.println();
        resDouble = method.overloadDemonstrationMethod(1.1, 2.2);
        System.out.println();
        System.out.println("Double result = " + (float) resDouble);
        System.out.println();
        System.out.println(method.overloadDemonstrationMethod(d, resDouble));
        System.out.println(method.overloadDemonstrationMethod(b, s));
        System.out.println(method.overloadDemonstrationMethod(d, f));
    }
}
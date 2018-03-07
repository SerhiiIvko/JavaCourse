package classworks.mar062018.classwork.task4;

public class Runner {
    public static void main(String[] args) {
        OverMeth overMeth = new OverMeth();
        int resInt;
        double resDouble;

        overMeth.ovDemo();
        overMeth.ovDemo(1);
        resInt = overMeth.ovDemo(2, 3);
        resDouble = overMeth.ovDemo(1.1, 2.2);
        System.out.println("Int result = " + resInt);
        System.out.println("Double result = " + (float) resDouble);
    }
}

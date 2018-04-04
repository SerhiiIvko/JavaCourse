package classworks.march2018.mar062018.classwork.task7;

public class OverloadConstructor {
    int x;

    OverloadConstructor() {
        System.out.println("Inside overloadConstructor1 x = " + (x = 0));
    }

    OverloadConstructor(int i) {
        System.out.println("Inside overloadConstructor2 x = " + (x = i));
    }

    OverloadConstructor(double d) {
        System.out.println("Inside overloadConstructor3 x = " + (x = (int) d));
    }

    OverloadConstructor(int y, int z) {
        System.out.println("Inside overloadConstructor4 x = " + (x = y * z));
    }
}
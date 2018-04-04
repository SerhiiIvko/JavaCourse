package classworks.march2018.mar222018.classwork.task1;

public interface InterfaceDefaultMethod {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 10;
    }
}
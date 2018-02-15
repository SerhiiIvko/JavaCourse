package classworks.feb132018.classwork.task3;

import classworks.feb132018.classwork.task2.FirstMethod;

public class StringArgs {
    public static void printHello(String name) {
        System.out.println("Hello! " + name);

    }

    public static void main(String[] args) {
        printHello("Petro!");
        System.out.println(FirstMethod.getSum(4, 7));
    }
}
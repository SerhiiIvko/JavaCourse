package classworks.april.apr122018.classwork.task1;

import java.util.Arrays;

/**
 * Created by ivko on 12.04.18.
 */
public class ArrayHolder {
    private int[] array;


    public ArrayHolder(int size) {
        this.array = new int[size];
    }

    public void insertToArray(int value, int index) {
        try {
            for (int i = 0; i < array.length; i++) {
                array[index] = value;
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Incorrect index");
        }
    }

    public void showArray() {
        System.out.println(Arrays.toString(array));
    }
}
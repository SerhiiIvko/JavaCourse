package classworks.mar272018.homework.task1;

import com.sun.org.apache.xpath.internal.operations.Number;

import java.util.Arrays;

public class Array implements IArray {
    private int size;

    public Array(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Number[] create() {
        return new Number[getSize()];
    }

    @Override
    public void print(Number[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    @Override
    public double getSum(Array[] array) {
        return 0;
    }

    @Override
    public double getDifferent(Array[] array) {
        return 0;
    }

    @Override
    public double getMultiply(Array[] array) {
        return 0;
    }


    @Override
    public String toString(Array[] array) {
        return Arrays.toString(array);
    }
}
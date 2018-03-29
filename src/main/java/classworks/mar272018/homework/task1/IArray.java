package classworks.mar272018.homework.task1;

import com.sun.org.apache.xpath.internal.operations.Number;

public interface IArray {
    Number[] create();

    void print(Number[] numbers);

    double getSum(Array[] array);

    double getDifferent(Array[] array);

    double getMultiply(Array[] array);

    String toString(Array[] array);
}
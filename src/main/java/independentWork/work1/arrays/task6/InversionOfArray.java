package independentWork.work1.arrays.task6;

import java.util.Arrays;

/**
 * Created by ivko on 18.12.17.
 */
public class InversionOfArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}

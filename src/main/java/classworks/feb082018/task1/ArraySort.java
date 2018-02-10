package classworks.feb082018.task1;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Arrays.sort(array, Collections.reverseOrder());
    }
}
package classworks.february2018.feb152018.classwork.task6;

import java.util.Arrays;

public class GetAverageArray {
    static double getAverage(int[] array) {
        double sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return (sum / array.length);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(getAverage(array));
    }
}
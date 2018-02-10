package classworks.feb062018.task3;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {5, 6, 8, 6, 9, 2, 1, 3, 4};
        int first = 0;
        int last = arr.length;
        int number = 6;

        int position = (first + last) / 2;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while ((arr[position] != number) && (first <= last)) {
            if (arr[position] > number) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(number + " is " + ++position + " element in array");
        } else {
            System.out.println("element not found");
        }

    }
}

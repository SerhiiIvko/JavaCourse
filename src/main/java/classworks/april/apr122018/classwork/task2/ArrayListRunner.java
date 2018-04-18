package classworks.april.apr122018.classwork.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ivko on 12.04.18.
 */
public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Start capacity = " + arrayList.size());

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");

        System.out.println("Collection: " + arrayList);
        arrayList.add(1, "Hello world!");
        System.out.println("Collection update: " + arrayList);
        System.out.println("End capacity = " + arrayList.size());
        arrayList.remove(arrayList.size() - 1);
        System.out.println("Collection update: " + arrayList);
        System.out.println("End capacity = " + arrayList.size());
        arrayList.set(0, "Yes");
        System.out.println("Collection update: " + arrayList);

        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        ar2.add(5);

        Integer[] arr3 = new Integer[ar2.size()];
        arr3 = ar2.toArray(arr3);
        System.out.println(Arrays.toString(arr3));

        int sum = 0;
        for (int i : arr3) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        List<Integer> integers = Arrays.asList(arr3);
        System.out.println("New list: " + integers);

        //integers.remove(1);
//        integers.
    }
}
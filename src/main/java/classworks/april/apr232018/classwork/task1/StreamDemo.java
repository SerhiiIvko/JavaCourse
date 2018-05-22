package classworks.april.apr232018.classwork.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by ivko on 23.04.18.
 */
public class StreamDemo {
    static <T> void consumer(T imp) {
        System.out.println(imp);
    }

    static void dirStream() {
        System.out.println("Stream--------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        String s = "Hello";
        for (int item : arr) {
            System.out.println("item = " + item);
        }

        System.out.println("===================");
        Stream.of("first", "second", s)
                .forEach(System.out::println);

        IntStream.of(arr)
                .distinct()
                .map(x -> x * x)
                .forEach(System.out::println);

        int c = Arrays.stream(arr).sum();
        System.out.println("Sum = " + c);
    }

    static List<String> stringList = new ArrayList<>();

    static {
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("6");
        stringList.add("7");
        stringList.add("8");
    }

    public static void collectionStream() {
//        System.out.println("==================");
//        for (String item :
//                stringList) {
//            System.out.println(item);
//        }
//        stringList.stream();
//        System.out.println("------------------");

        List<String> res = stringList
                .stream()
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        res.forEach(System.out::println);

    }

    public static void main(String[] args) {
        dirStream();
//        consumer();
        collectionStream();
    }
}
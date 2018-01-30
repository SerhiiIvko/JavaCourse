package classworks.feb012018.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        List<String> list = new LinkedList<String>();
        list.add("One");
        list.get(0);
        cities.add("Dnipro");
        cities.add("Istanbul");
        cities.add("Antalya");
        cities.add("Kemer");
        numbers.add(10);
        System.out.println(cities);
        cities.remove(0);
        System.out.println(cities);
        System.out.println(numbers);
        System.out.println(list);
        //palindrom found
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        scanner.close();
//        String result = new StringBuffer(s).reverse().toString();
//        if (s.equals(result)) {
//            System.out.println("good");
//        } else {
//            System.out.println("bad");
//        }
        //

        int arr[] = {2, 5, 7, 9};
        System.out.println(Arrays.toString(arr));

        String text = "abcdefghijklmnopqrstuvwxyz";

        for (int i = (text.length() - 1); i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        char c1 = 064770;
        //char c2 = 'face';
        char c3 = 0xbeef;
        //char c4 = \u0022;
        //char c5 = '\iface';
        char c6 = '\uface';
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c6);
        System.out.println();
        int a = 5;


        System.out.println("Программа работает успешно!");
    }
}

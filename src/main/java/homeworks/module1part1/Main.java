package homeworks.module1part1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
            array[i] = array[i].trim();
        }
        scanner.close();
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        String[] arr_res = new String[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i].charAt(0) == array[i - 1].charAt(0)) {
                boolean is_unique = true;
                for (int k = 0; k < arr_res.length; k++) {
                    if (arr_res[k].charAt(0) == array[i].charAt(0)) {
                        is_unique = false;
                        break;
                    }
                }
                if (is_unique) {
                    arr_res[i] = array[i];
                    //System.out.println(arr_res[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr_res));
    }
}


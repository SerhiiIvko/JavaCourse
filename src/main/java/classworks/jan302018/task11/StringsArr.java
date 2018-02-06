package classworks.jan302018.task11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11.Дан массив строк. Вывести те из них, которые начинаются на одну букву (без учета регистра)
 */
public class StringsArr {
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
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        int countRepeats = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].charAt(0) == array[i - 1].charAt(0)) {
                countRepeats++;
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (array[i].charAt(0) == alphabet[j] && countRepeats > 2) {
                    System.out.println(array[i]);
                }
            }

        }

//        boolean repeat = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] = ){
//                repeat = true;
//            }
//        }


//        int index = 0;
//        String [] arrayCopy = new String[array.length];
//        for (int i = 1; i < array.length; i++) {
//            array[i] = array[i].toLowerCase();
//            for (int j = i+1; j < array.length; ++j) {
//                if (array[i].charAt(0) == array[j].charAt(0)) {
////                System.out.println(array[i-1]);
//                System.out.println(array[i]);
//                }
//                ++index;
//            }
//
//
//        }
//        System.out.println(Arrays.toString(arrayCopy));
    }
}
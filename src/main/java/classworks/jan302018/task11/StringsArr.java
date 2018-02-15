package classworks.jan302018.task11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11.Дан массив строк. Вывести те из них, которые начинаются на одну букву (без учета регистра)
 */
public class StringsArr {
    public static void main(String[] args) {
        System.out.println("Input string or sentence: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
            array[i] = array[i].trim();
        }
        scanner.close();
        Arrays.sort(array);
        System.out.println("Words with repeatable first character:");
        for (int i = 0; i < array.length; i++) {
            if ((i > 0 && array[i].charAt(0) == array[i - 1].charAt(0)) ||
                    (i < array.length - 1 && array[i].charAt(0) == array[i + 1].charAt(0))) {
                System.out.println(array[i]);
            }
        }
    }
}
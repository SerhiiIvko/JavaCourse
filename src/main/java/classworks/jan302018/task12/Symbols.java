package classworks.jan302018.task12;

import java.util.Scanner;

/**
 * 12. Дано предложение. Найти наибольшее количество идущих подряд одинаковых символOB.
 */
public class Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        int count = 0;
        char repeat = 0;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) == string.charAt(i)) {

                count++;
                repeat = string.charAt(i);
            }
        }
        System.out.println(repeat);
        System.out.println(count);
    }
}

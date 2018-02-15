package classworks.jan302018.task12;

import java.util.Scanner;

/**
 * 12. Дано предложение. Найти наибольшее количество идущих подряд одинаковых символOB.
 */

public class Symbols {
    public static void main(String[] args) {
        System.out.println("Input sentence:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        char repeatChar = 0;
        int maxCount = 0;
        int currentMaxCount = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) == string.charAt(i)) {
                currentMaxCount++;
                if (currentMaxCount > maxCount) {
                    maxCount = currentMaxCount;
                    if (repeatChar != string.charAt(i)) {
                        repeatChar = string.charAt(i);
                    }
                }
            } else if (currentMaxCount > 0) {
                currentMaxCount = 1;
            }
        }
        System.out.println("Maximum repeatable character is " + "'" + repeatChar + "'");
        System.out.println("It's repeat " + maxCount + " times");
    }
}
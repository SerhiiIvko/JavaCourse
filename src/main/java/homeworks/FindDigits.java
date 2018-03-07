package homeworks;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        char digitChar = 0;
        int maxDigitCount = 0;
        int currentDigitCount = 1;
        char[] digits = new char[string.length()];
        for (int i = 1; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i - 1)) && Character.isDigit(string.charAt(i))) {
                currentDigitCount++;
                if (currentDigitCount > maxDigitCount) {
                    maxDigitCount = currentDigitCount;
                    if (digitChar != string.charAt(i - 1) && digitChar != string.charAt(i)) {
                        digits[i - 1] = string.charAt(i - 1);
                        digits[i] = string.charAt(i);
                    }
                }
            } else if (currentDigitCount > 1) {
                break;
            }
        }
        for (char digit : digits) {
            System.out.print(digit);
        }
    }
}
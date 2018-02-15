package independentWork;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        boolean isPalindrom = false;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        char[] newString = string.toCharArray();
        for (int i = 0; i < newString.length / 2; i++) {
            char tmp = newString[i];
            newString[i] = newString[newString.length - i - 1];
            newString[newString.length - i - 1] = tmp;
        }
        String string1 = new String(newString);
        if (string1.equals(string)) {
            isPalindrom = true;
        }
        System.out.println(isPalindrom);
        System.out.println("other part:");
        StringBuilder stringBuilder = new StringBuilder(string);
        isPalindrom = stringBuilder.toString().equals(stringBuilder.reverse().toString());
        System.out.println(isPalindrom);
    }
}
package classworks.feb152018.homework.part2.task3;

import java.util.Scanner;

/**
 * Даны три слова. Выяснить, является ли хоть одно из них палиндромом (“перевертышем”), т.е. таким, которое читается
 * одинаково слева на право и справа налево. (Определить функцию, позволяющую распознать слова-палиндромы.)
 */
public class Palindrom {

    static boolean isPalindrom(String str1, String str2, String str3) {
        boolean isPalindrom = false;
        StringBuilder stringBuilder = new StringBuilder(str1);
        StringBuilder stringBuilder1 = new StringBuilder(str2);
        StringBuilder stringBuilder2 = new StringBuilder(str3);
        if (stringBuilder.toString().equals(stringBuilder.reverse().toString()) ||
                stringBuilder1.toString().equals(stringBuilder1.reverse().toString()) ||
                stringBuilder2.toString().equals(stringBuilder2.reverse().toString())) {
            isPalindrom = true;
        }
        return isPalindrom;
    }

    public static void main(String[] args) {
        System.out.println("Input three words.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first word:");
        String str1 = scanner.nextLine();
        System.out.println("Input second word:");
        String str2 = scanner.nextLine();
        System.out.println("Input third word:");
        String str3 = scanner.nextLine();
        scanner.close();
        System.out.println(isPalindrom(str1, str2, str3));
    }
}
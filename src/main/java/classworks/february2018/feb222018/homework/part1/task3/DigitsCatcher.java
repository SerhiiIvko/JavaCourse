package classworks.february2018.feb222018.homework.part1.task3;

import java.util.Scanner;

/**
 * Пользователь вводит текст, в котором имеются несколько идущих подряд цифр. Написать метод, который получает число,
 * образованное этими цифрами (сделать проверку на наличие цифр в тексте, вывести первые идущие подряд цифры, остальные
 * не нужно).
 */
public class DigitsCatcher {

    public int catchNumber(String text) {
        char[] chars = text.toCharArray();
        char[] numbers = new char[chars.length];
        int numberCount = 0;
        for (int i = 1; i < chars.length; ++i) {
            if (Character.isDigit(chars[i - 1]) && Character.isDigit(chars[i])) {
                if (numberCount == 0) {
                    numbers[numberCount++] = chars[i - 1];
                }
                numbers[numberCount++] = chars[i];
            } else if (numberCount > 0) {
                return getNumberFromCharArray(numbers, numberCount);
            }
        }
        if (numberCount > 0) {
            return getNumberFromCharArray(numbers, numberCount);
        }
        throw new IllegalArgumentException("Строка пустая или идущих подряд цифр в строке нет!");
    }

    public int getNumberFromCharArray(char[] numbers, int numberCount) {
        char[] copyNumber = new char[numberCount];
        System.arraycopy(numbers, 0, copyNumber, 0, numberCount);
        String stringNumbers = new String(copyNumber);
        return Integer.parseInt(stringNumbers);
    }

    public void printNumber(String string) {
        if (string.isEmpty()) {
            System.out.println("Строка пустая!");
        }
        if (string.matches("\\D+")) {
            System.out.println("Идущих подряд цифр в строке нет!");
        } else {
            char[] str = string.toCharArray();
            for (int i = 0; i < str.length; i++) {
                if (((str[i] >= '0') && (str[i] <= '9'))) {
                    System.out.print(str[i]);
                }
            }
        }
        System.out.println();
    }

    public void printDigitsFromString(String string) {
        int currentDigitCount = 1;
        char[] digits = new char[string.length()];
        if (string.isEmpty()) {
            System.out.println("Строка пустая!");
        }
        for (int i = 1; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i - 1)) && Character.isDigit(string.charAt(i))) {
                currentDigitCount++;
                digits[i - 1] = string.charAt(i - 1);
                digits[i] = string.charAt(i);
            } else if (currentDigitCount > 1) {
                break;
            }
        }

        for (char digit : digits) {
            if (currentDigitCount > 1) {
                System.out.print(digit);
            } else {
                System.out.println("Идущих подряд цифр в строке нет!");
                return;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DigitsCatcher digitsCatcher = new DigitsCatcher();
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        int number;
        System.out.println("Метод, возвращающий число, образованное первыми идущими подряд цифрами в строке (1 вариант):");
        try {
            number = digitsCatcher.catchNumber(string);
            System.out.println(number);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Метод, печатающий число, образованное первыми идущими подряд цифрами в строке (2 вариант):");
        digitsCatcher.printDigitsFromString(string);
        System.out.println("Метод, печатающий все цифры, входящие в строку, в виде числа:");
        digitsCatcher.printNumber(string);
    }
}
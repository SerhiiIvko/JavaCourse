package independentWork.work1.methods.task2;

import java.util.Scanner;

/**
 * Вводим число (0-999), получаем строку с прописью числа.
 */
public class NameOfValue {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 999");
        System.out.print(getNameOfValue());
    }

    public static String getNameOfValue() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        String name = "";
        String tensName = "";
        String onesName = "";
        String hungredsName = "";
        String[] hungreds = {"Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот"};
        String[] tens = {" двадцать ", " тридцать ", " сорок ", " пятьдесят ", " шестьдесят ", " семьдесят ", " восемьдесят", " девяносто"};
        String[] ones = {" один ", " два ", " три ", " четыре ", " пять ", " шесть ", " семь ", " восемь ", " девять "};
        String[] dozens = {" десять ", " одиннадцать ", " двенадцать ", " тринадцать ", " четырнадцать ", " пятнадцать ", " шестнадцать ", " семнадцать ", " восемнадцать ", " девятнадцать "};
        if (number == 0) {
            name = "Ноль";
        }
        if (number % 10 <= 9) {
            for (int i = 0; i < ones.length; i++) {
                if (number == i + 1) {
                    name = ones[i];
                }
            }
        }
        if (number > 9 && number < 20) {
            for (int i = 0; i < dozens.length; i++) {
                if (number % 10 == i) {
                    name = dozens[i];
                }
            }
        }
        if (number > 19 && number <= 99) {
            for (int i = 0; i < tens.length; i++) {
                if (number / 10 == i + 2) {
                    tensName = tens[i];
                }
                for (int j = 0; j < ones.length; j++) {
                    if (number % 10 == j + 1) {
                        onesName = ones[j];
                    }
                }
                name = tensName.concat(onesName);
            }
        }
        if (number > 99 && number <= 999) {
            for (int i = 0; i < hungreds.length; i++) {
                if (number / 100 == i + 1) {
                    hungredsName = hungreds[i];
                }
            }
            for (int i = 0; i < tens.length; i++) {
                if ((number / 10) % 10 == i + 2) {
                    tensName = tens[i];
                }
                for (int j = 0; j < ones.length; j++) {
                    if (number % 10 == j + 1) {
                        onesName = ones[j];
                    }
                }
            }
            name = hungredsName.concat(tensName.concat(onesName));
        } else {
            System.out.println("Input correct value");
        }
        return name;
    }
}
package independentWork.work1.methods.task3;

import java.util.Scanner;

/**
 * Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число.
 */
public class DigitsOfNumber {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 999");
        System.out.print(getValueFromName());
    }

    public static int getValueFromName() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();

        int value = 0;
        int onesValue = 0;
        int dozensValue = 0;
        int tensValue = 0;
        int hungredsValue = 0;
        String[] numbers = number.split("\\s+");
        String zero = "Ноль";
        String[] hungreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] tens = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] ones = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] dozens = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

        if (zero.equalsIgnoreCase("Ноль")) {
            value = 0;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < hungreds.length; j++) {
                if (numbers[i].equalsIgnoreCase(hungreds[j])) {
                    hungredsValue = (j + 1) * 100;
                }
                for (int k = 0; k < dozens.length; k++) {
                    if (numbers[i].equalsIgnoreCase(dozens[k])) {
                        dozensValue = k + 10;
                    }
                    for (int l = 0; l < tens.length; l++) {
                        if (numbers[i].equalsIgnoreCase(tens[l])) {
                            tensValue = (l + 2) * 10;
                        }
                        for (int m = 0; m < ones.length; m++) {
                            if (numbers[i].equalsIgnoreCase(ones[m])) {
                                onesValue = m + 1;
                            }
                        }
                    }
                }
            }
            value = hungredsValue + dozensValue + tensValue + onesValue;
        }
        return value;
    }
}
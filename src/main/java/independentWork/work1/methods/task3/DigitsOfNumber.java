package independentWork.work1.methods.task3;

import java.util.Scanner;

/**
 * Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число.
 */
public class DigitsOfNumber {
    public static void main(String[] args) {
        System.out.println("Input number from 0 to 999");
        System.out.print(getValueFromName());
    }

    public static int getValueFromName() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();

        int value = 0;
        int tensValue = 0;
        int onesValue = 0;
        int hungredsValue = 0;
        String zero = "Ноль";
        String[] hungreds = {"Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот"};
        String[] tens = {" двадцать ", " тридцать ", " сорок ", " пятьдесят ", " шестьдесят ", " семьдесят ", " восемьдесят", " девяносто"};
        String[] ones = {" один ", " два ", " три ", " четыре ", " пять ", " шесть ", " семь ", " восемь ", " девять "};
        String[] dozens = {" десять ", " одиннадцать ", " двенадцать ", " тринадцать ", " четырнадцать ", " пятнадцать ", " шестнадцать ", " семнадцать ", " восемнадцать ", " девятнадцать "};
        if (zero.equals("Ноль")) {
            value = 0;
        }

        return value;
    }
}

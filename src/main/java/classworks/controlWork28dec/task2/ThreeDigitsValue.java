package classworks.controlWork28dec.task2;

/**
 * 2.Дано трехзначное чило. Найти:
 * a.число единиц в нём
 * b.число десятков в нем
 * c.сумму его цифр
 * d.произведение его цифр
 */
public class ThreeDigitsValue {
    public static void main(String[] args) {
        int number = 345;

        int ones = number % 10;
        int tens = (number - ones) / 10;
        int sumOfDigits = (number % 10) + (tens % 10) + (tens / 10);
        int multiply = (number % 10) * (tens % 10) * (tens / 10);

        System.out.println("Единиц в числе " + ones + ", десятков " + tens + ", сумма его цифр " + sumOfDigits + ", произведение его цифр " + multiply);
    }
}

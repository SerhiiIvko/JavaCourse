package classworks.december2017.controlWork28dec.task5;

/**
 * 5.Дано четырехзначное число. Определить:
 * a.равна ли сумма двух первых его цифр сумме двух последних
 * b.кратна ли трем сумма его цифр
 * c.кратно ли четырём произведение его цифр
 * d.кратно ли произведение его цифр числу a (a – сгенерированное число)
 */
public class FourDigitsValue {
    public static void main(String[] args) {
        int number = 2332;
        int a = (int) (Math.random() * 5);
        int ones = number % 10;
        number = number / 10;
        int tens = number % 10;
        number = number / 10;
        int hungreds = number % 10;
        number = number / 10;
        int thousands = number % 10;

        if (ones + tens == hungreds + thousands) {
            System.out.println("сумма двух первых цифр числа равна его цифр сумме двух последних");
        } else {
            System.out.println("сумма двух первых цифр числа равна его цифр сумме двух последних");
        }
        if ((ones + tens + hungreds + thousands) % 3 == 0) {
            System.out.println("сумма его цифр числа кратна трем");
        } else {
            System.out.println("сумма его цифр числа не кратна трем");
        }
        if ((ones * tens * hungreds * thousands) % 4 == 0) {
            System.out.println("произведение цифр числа кратно четырём");
        } else {
            System.out.println("произведение цифр числа не кратно четырём");
        }
        if ((ones * tens * hungreds * thousands) % a == 0) {
            System.out.println("произведение цифр числа кратно числу " + a);
        } else {
            System.out.println("произведение цифр числа не кратно числу " + a);
        }
    }
}

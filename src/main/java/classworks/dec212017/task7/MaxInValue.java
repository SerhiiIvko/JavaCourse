package classworks.dec212017.task7;

/**
 * 4.Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 * (Используем класс Math или Random)
 */
public class MaxInValue {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 500);
        System.out.println(number);

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        int max;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Максимальное значение в числе " + max);
    }
}

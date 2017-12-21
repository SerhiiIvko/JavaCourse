package classworks.dec212017.task6;

/**
 * 3.Создаем три переменные  a, b, c записываем в них любые не равные между собой значения. Написать
 * программу, которая переставит числа в переменных таким образом, чтобы при выводе их на экран
 * последовательность a, b и c оказалась строго возрастающей.
 */
public class SortByMax {
    public static void main(String[] args) {
        int a = 56;
        int b = 23;
        int c = 42;

        int m1;
        int m2;
        int m3 = 0;

        if (a > b) {
            m3 = a;
        }
        if (b > c) {
            m2 = b;
            m1 = c;
        } else {
            m1 = b;
            m2 = c;
        }
        System.out.println(m1 + " " + m2 + " " + m3);
    }
}

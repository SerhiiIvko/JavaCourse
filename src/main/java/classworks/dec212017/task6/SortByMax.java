package classworks.dec212017.task6;

/**
 * 3.Создаем три переменные  a, b, c записываем в них любые не равные между собой значения. Написать
 * программу, которая переставит числа в переменных таким образом, чтобы при выводе их на экран
 * последовательность a, b и c оказалась строго возрастающей.
 */
public class SortByMax {
    public static void main(String[] args) {
        int a = 80;
        int b = 26;
        int c = 2;
        System.out.println("First input: " + a + " " + b + " " + c);

        int smaller = (Math.min(Math.min(a, b), c));
        int medium;
        int bigger = (Math.max(Math.max(a, b), c));

        if (a != smaller && a != bigger) {
            medium = a;
        } else if (b != smaller && b != bigger) {
            medium = b;
        } else {
            medium = c;
        }
        System.out.println("Sorted output: " + smaller + " " + medium + " " + bigger);
    }
}

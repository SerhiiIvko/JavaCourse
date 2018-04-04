package classworks.january2018.jan182018.task5;

/**
 * 5.Используя цикл while необходимо вывести на экран следующую последовательность чисел:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 */
public class SevenLine {
    public static void main(String[] args) {
        int n = 7;
        while (n < 99) {
            System.out.print(n + " ");
            n += 7;
        }
    }
}

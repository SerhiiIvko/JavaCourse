package classworks.january2018.jan182018.task3;

/**
 * 3.Напечатать таблицу умножения на 9 в обратном порядке:
 * 9 х 9 = 81
 * ...
 * 1 х 9 = 9
 */
public class ReverseMulty {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 10; i > 0; i--) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}

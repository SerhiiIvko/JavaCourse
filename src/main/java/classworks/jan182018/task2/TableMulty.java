package classworks.jan182018.task2;

/**
 * 2.Напечатать таблицу умножения на 7:
 * 1 х 7 = 7
 * ...
 * 9 х 7 = 63
 */
public class TableMulty {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}

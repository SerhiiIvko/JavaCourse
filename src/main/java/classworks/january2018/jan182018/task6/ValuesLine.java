package classworks.january2018.jan182018.task6;

/**
 * 6.Используя цикл while необходимо вывести на экран следующую последовательность чисел:
 * 1 2 4 8 16 32 64 128 256 512
 */
public class ValuesLine {
    public static void main(String[] args) {
        int i = 1;
        while (i < 513) {
            System.out.print(i + " ");
            i *= 2;
        }
    }
}

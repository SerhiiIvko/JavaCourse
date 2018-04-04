package classworks.january2018.jan232018.task4;

public class DigitsMatrix {
    public static void main(String[] args) {
        final int rows = 4;
        final int columns = 10;
        int a = 40;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= columns; j += 1) {
                System.out.print(a + j + " ");
            }
            a += 10;
            System.out.println();
        }
    }
}
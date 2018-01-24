package classworks.jan232018.task3;

public class Digits {
    public static void main(String[] args) {
        final int rows = 4;
        final int columns = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= columns; j += 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
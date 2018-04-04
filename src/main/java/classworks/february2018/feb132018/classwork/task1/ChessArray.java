package classworks.february2018.feb132018.classwork.task1;

public class ChessArray {
    public static void main(String[] args) {
        int rowSize = 7;
        int columnSize = 7;
        int digit = 1;
        int[][] array = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if ((i + j) % 2 != 0) {
                    array[i][j] = digit;
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
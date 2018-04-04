package classworks.february2018.feb082018.homework.task4;

/**
 * Заполнить двумерный массив размерностью 7х7 следующим образом
 * <p>
 * 1 0 0 0 0 0 1
 * 0 1 0 0 0 1 0
 * 0 0 1 0 1 0 0
 * 0 0 0 1 0 0 0
 * 0 0 1 0 1 0 0
 * 0 1 0 0 0 1 0
 * 1 0 0 0 0 0 1
 * <p>
 * 1 0 0 0 0 0 1
 * 0 1 0 0 0 1 0
 * 0 0 1 0 1 0 0
 * 1 1 1 1 1 1 1
 * 0 0 1 0 1 0 0
 * 0 1 0 0 0 1 0
 * 1 0 0 0 0 0 1
 */

public class ArrayOrnament {
    public static void main(String[] args) {
        int rowSize = 7;
        int columnSize = 7;
        int[][] array = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (i == j || i + j == rowSize - 1) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }
        System.out.println("Part 1: ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (i == j || i + j == rowSize - 1 || j == rowSize / 2) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }
        System.out.println();
        System.out.println("Part 2: ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
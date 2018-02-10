package classworks.feb082018.homework.task4;

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
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }
        System.out.println("Part 1: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || i + j == array.length - 1 || j == array.length / 2) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }
        System.out.println();
        System.out.println("Part 2: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
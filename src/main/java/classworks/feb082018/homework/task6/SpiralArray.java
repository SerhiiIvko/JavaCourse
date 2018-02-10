package classworks.feb082018.homework.task6;

/**
 * Заполнить двумерный массив размерностью 7х7 числами 1,2,3…,49, расположенными в нем по спирали
 */
public class SpiralArray {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        int value = 1;
        int minCol = 0;
        int maxCol = 7 - 1;
        int minRow = 0;
        int maxRow = 7 - 1;
        while (value <= 7 * 7) {
            for (int i = minCol; i <= maxCol; i++) {
                array[minCol][i] = value;
                value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                array[i][maxCol] = value;
                value++;
            }
            for (int j = maxCol - 1; j >= minCol; j--) {
                array[maxRow][j] = value;
                value++;
            }
            for (int j = maxRow - 1; j >= minRow + 1; j--) {
                array[j][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;

        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

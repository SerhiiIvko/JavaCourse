package classworks.february2018.feb082018.homework.task6;

/**
 * Заполнить двумерный массив размерностью 7х7 числами 1,2,3…,49, расположенными в нем по спирали
 */
public class SpiralArray {
    public static void main(String[] args) {
        int rowSize = 7;
        int columnSize = 7;
        int[][] array = new int[rowSize][columnSize];
        int value = 1;
        int minCol = 0;
        int maxCol = columnSize - 1;
        int minRow = 0;
        int maxRow = rowSize - 1;
        while (value <= rowSize * columnSize) {
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
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
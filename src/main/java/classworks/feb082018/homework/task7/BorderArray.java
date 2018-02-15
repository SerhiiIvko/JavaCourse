package classworks.feb082018.homework.task7;

/**
 * Заполните массив размерностью 7Х7 знаком решетка # и пробелом “ ”, чтобы получилась такая фигура:
 */
public class BorderArray {
    public static void main(String[] args) {
        int rowSize = 7;
        int columnSize = 7;
        char[][] array = new char[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if ((i == 0 || j == columnSize - 1) || (i == rowSize - 1 || j == 0)) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
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
package classworks.feb082018.homework.task7;

/**
 * Заполните массив размерностью 7Х7 знаком решетка # и пробелом “ ”, чтобы получилась такая фигура:
 */
public class BorderArray {
    public static void main(String[] args) {
        char[][] array = new char[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 || j == 7 - 1) || (i == 7 - 1 || j == 0)) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

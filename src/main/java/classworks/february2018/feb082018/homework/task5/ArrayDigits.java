package classworks.february2018.feb082018.homework.task5;

/**
 * Заполнить массив размером 6 х 6 следующим образом
 * 1	1	1	1	1	1
 * 1	2	3	4	5	6
 * 1	3	6	10	15	21
 * 1	4	10	20	35	56
 * 1	5	15	35	70	126
 * 1	6	21	56	126	252
 **/
public class ArrayDigits {
    public static void main(String[] args) {
        int rowSize = 6;
        int columnSize = 6;
        int[][] array = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (i == 0 || j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i][j - 1];
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
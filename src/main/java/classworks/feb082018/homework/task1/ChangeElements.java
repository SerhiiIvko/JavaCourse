package classworks.feb082018.homework.task1;

/**
 * 1)Дан двумерный массив. Поменять местами:
 * а) Элементы, расположенные в верхнем правом и нижним левым местах.
 * б) Элементы, расположенные в нижнем правом и верхним левым углах.
 */
public class ChangeElements {
    public static void main(String[] args) {
        int rowSize = 10;
        int columnSize = 10;
        int[][] array = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        int tmp = array[0][0];
        array[0][0] = array[rowSize - 1][columnSize - 1];
        array[rowSize - 1][columnSize - 1] = tmp;
        tmp = array[rowSize - 1][0];
        array[rowSize - 1][0] = array[0][columnSize - 1];
        array[0][columnSize - 1] = tmp;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
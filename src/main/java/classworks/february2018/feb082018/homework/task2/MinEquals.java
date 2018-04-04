package classworks.february2018.feb082018.homework.task2;

/**
 * Дан двумерный массив, определить:
 * а) какой элемент массива меньше: в нижнем правом углу или в нижнем левом.
 * б) какой элемент массива больше: в верхнем правом или в верхнем левом углу.
 */
public class MinEquals {
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
        System.out.print("Min value is ");
        System.out.println(array[rowSize - 1][columnSize - 1] < array[rowSize - 1][0] ? array[rowSize - 1][columnSize - 1] :
                array[rowSize - 1][0]);
        System.out.print("Max value is ");
        System.out.println(array[0][0] > array[0][columnSize - 1] ? array[0][0] : array[0][columnSize - 1]);
    }
}
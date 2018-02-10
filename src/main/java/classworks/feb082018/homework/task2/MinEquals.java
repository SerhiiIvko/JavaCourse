package classworks.feb082018.homework.task2;

/**
 * Дан двумерный массив, определить:
 * а) какой элемент массива меньше: в нижнем правом углу или в нижнем левом.
 * б) какой элемент массива больше: в верхнем правом или в верхнем левом углу.
 */
public class MinEquals {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Min value is ");
        System.out.println(array[9][9] < array[9][0] ? array[9][9] : array[9][0]);
        System.out.print("Max value is ");
        System.out.println(array[0][0] > array[0][9] ? array[0][0] : array[0][9]);
    }
}
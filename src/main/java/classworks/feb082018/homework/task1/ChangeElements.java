package classworks.feb082018.homework.task1;

/**
 * 1)Дан двумерный массив. Поменять местами:
 * а) Элементы, расположенные в верхнем правом и нижним левым местах.
 * б) Элементы, расположенные в нижнем правом и верхним левым углах.
 */
public class ChangeElements {
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
        int tmp = array[0][0];
        array[0][0] = array[array.length - 1][9];
        array[array.length - 1][9] = tmp;
        tmp = array[9][0];
        array[9][0] = array[0][9];
        array[0][9] = tmp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
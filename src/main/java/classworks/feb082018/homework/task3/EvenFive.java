package classworks.feb082018.homework.task3;

/**
 * Дан двумерный массив целых чисел. Выяснить:
 * а) имеются ли нечетные числа в верхнем правом или в нижнем правом углу.
 * б) имеются ли числа, оканчивающиеся цифрой 5, в верхнем левом или нижнем левом углу.
 */
public class EvenFive {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        boolean isEvenHave = false;
        if (array[0][9] % 2 != 0 || array[9][9] % 2 != 0) {
            isEvenHave = true;
        }
        System.out.println(isEvenHave);
        boolean isHaveFive = false;
        if (array[0][0] == 5 || array[9][0] == 5 || array[0][0] % 10 == 5 || array[9][0] % 10 == 5) {
            isHaveFive = true;
        }
        System.out.println(isHaveFive);
    }
}
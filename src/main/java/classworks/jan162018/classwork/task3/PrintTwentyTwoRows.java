package classworks.jan162018.classwork.task3;

/**
 * 3.Напечатать числа в виде:
 * 20 20 20 20 20
 * 20 20 20 20 20
 */
public class PrintTwentyTwoRows {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println();
            }
            System.out.print("20 ");
        }
    }
}

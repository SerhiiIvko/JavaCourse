package classworks.jan162018.classwork.task4;

/**
 * 4.Напечатать в консоли треугольник используя символ +.
 */
public class PrintTriangulum {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
    }
}
package classworks.january2018.jan232018.task1;

public class TriangulumOne {
    public static void main(String[] args) {
        final int rows = 5;
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
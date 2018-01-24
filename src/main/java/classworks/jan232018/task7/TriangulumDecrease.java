package classworks.jan232018.task7;

public class TriangulumDecrease {
    public static void main(String[] args) {
        final int rows = 5;
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
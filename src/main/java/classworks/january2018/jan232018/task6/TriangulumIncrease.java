package classworks.january2018.jan232018.task6;

public class TriangulumIncrease {
    public static void main(String[] args) {
        final int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j - 1 + "  ");
            }
            System.out.println();
        }
    }
}
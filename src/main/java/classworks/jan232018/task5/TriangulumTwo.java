package classworks.jan232018.task5;

public class TriangulumTwo {
    public static void main(String[] args) {
        final int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(5 + "  ");
            }
            System.out.println();
        }
    }
}
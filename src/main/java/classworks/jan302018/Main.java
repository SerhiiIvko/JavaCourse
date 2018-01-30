package classworks.jan302018;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < (8 - i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  * ");
            }
            System.out.println();
        }
        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j < (8 - i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  * ");
            }
            System.out.println();
        }
    }
}
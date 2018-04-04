package classworks.december2017.dec212017.task11;

public class ChessBoard {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = 5;
        int d = 2;

        if (Math.abs(a - c) == 0 || Math.abs(b - d) == 0) {
            System.out.println("Ладья (a,b) угрожает фигуре (c,d)");
        }

        if (Math.abs(a - c) == Math.abs(b - d)) {
            System.out.println("Слон (a,b) угрожает фигуре (c,d)");
        }

        if (Math.abs(a - c) == 1 || Math.abs(b - d) == 1) {
            System.out.println("Король (a,b) может одним ходом попасть на (c,d)");
        }

        if ((Math.abs(a - c) == Math.abs(b - d)) || (Math.abs(a - c) == 0) || (Math.abs(b - d) == 0)) {
            System.out.println("Ферзь (a,b) угрожает полю (c,d)");
        }

        if ((a + c == 1 && b - d == 0) || (a + c == 2 && b - d == 0)) {
            System.out.println("Белая пешка (a,b) может попсать на поле (c,d)");
        }
        if (Math.abs(a - c) == 1 && Math.abs(b - d) == 1) {
            System.out.println("Белая пешка (a,b) бьёт фигуру и перемещается на поле (c,d)");
        }

        if ((Math.abs(c - a) == 1 && Math.abs(d - b) == 0) || (Math.abs(c - a) == 2 && Math.abs(b - d) == 0)) {
            System.out.println("Чёрная пешка (a,b) может попсать на поле (c,d)");
        }
        if (Math.abs(c - a) == 1 && Math.abs(d - b) == 1) {
            System.out.println("Чёрная пешка (a,b) бьёт фигуру и перемещается на поле (c,d)");
        }

        if (Math.abs(a - c) == 2 && Math.abs(b - d) == 1) {
            System.out.println("Конь (a,b) угрожает фигуре (c,d)");
        }
    }
}

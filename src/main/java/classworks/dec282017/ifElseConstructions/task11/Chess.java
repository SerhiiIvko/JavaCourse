package classworks.dec282017.ifElseConstructions.task11;

import java.util.Scanner;

/**
 * Даны натуральные числа от 1 до 8.
 * Записать условие, при котором белая фигура, расположенная на поле (a,b) может одним ходом пойти на поле (e,f), не попав
 * при этом под удар черной фигуры, стоящей на поле (c,d). Рассмотреть следующие варианты сочетания белой и черной фигур:
 * 1) ладья-ладья; 2) ладья-ферзь; 3) ладья-конь; 4) ладья-слон; 5) ферзь-ферзь; 6) ферзь-ладья; 7) ферзь-конь;
 * 8) ферзь-слон; 9) конь-конь; 10) конь-ладья; 11) конь-ферзь; 12) конь-слон; 13) слон-слон; 14) слон-ферзь;
 * 15) слон-конь; 16) слон-ладья; 17) король-слон; 18) король-ферзь; 19) король-конь; 20) король-ладья.
 */
public class Chess {
    public static void main(String[] args) {
        System.out.println("input coordinates of figures");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a coordinate of white figure: ");
        int a = scanner.nextInt();
        System.out.print("Input b coordinate of white figure: ");
        int b = scanner.nextInt();
        System.out.print("Input c coordinate of black figure: ");
        int c = scanner.nextInt();
        System.out.print("Input d coordinate of black figure: ");
        int d = scanner.nextInt();
        System.out.print("Input e coordinate of field for stroke white figure: ");
        int e = scanner.nextInt();
        System.out.print("Input f coordinate of field for stroke white figure: ");
        int f = scanner.nextInt();
        scanner.close();

        if (a < 1 || a > 8 || b < 1 || b > 8) {
            System.out.println("incorrect data for white figure!");
            return;
        }
        if (c < 1 || c > 8 || d < 1 || d > 8) {
            System.out.println("incorrect data for black figure!");
            return;
        }

        if (e < 1 || e > 8 || f < 1 || f > 8) {
            System.out.println("incorrect data for stroke field!");
            return;
        }

        if (a == e && b == f) {
            System.out.println("Figure must move");
            return;
        }

        if (e == c && f == d) {
            System.out.println("This condition can't be now");
            return;
        }

        if (a == c && a == d) {
            System.out.println("Two enemy figures can't be in this position");
            return;
        }

        System.out.print("1. Condition for white rook and black rook: ");
        if (Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            System.out.println(Math.abs(e) == Math.abs(c) || Math.abs(f) == Math.abs(d) ? "black rook kill white rook" :
                    "white rook can go");
        } else {
            System.out.println("incorrect input for rook");
        }
        System.out.print("2. Condition for white rook and black queen: ");
        if (Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            System.out.println((Math.abs(e - c) == Math.abs(f - d)) || (Math.abs(e - c) == 0) || (Math.abs(f - d) == 0) ?
                    "black queen kill white rook" : "white rook can go");
        } else {
            System.out.println("incorrect input for rook");
        }
        System.out.print("3. Condition for white rook and black knight: ");
        if (Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            if (Math.abs(e - c) == 2 && Math.abs(f - d) == 1 || Math.abs(d - f) == 2 && Math.abs(c - e) == 1) {
                System.out.println("black knight kill white rook");
            } else {
                System.out.println("white rook can go");
            }
        } else {
            System.out.println("incorrect input for rook");
        }
        System.out.print("4. Condition for white rook and black bishop: ");
        if (Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            if (Math.abs(e - c) == Math.abs(f - d)) {
                System.out.println("black bishop kill white rook");
            } else {
                System.out.println("white rook can go");
            }
        } else {
            System.out.println("incorrect input for rook");
        }

        System.out.print("5. Condition for white queen and black queen: ");
        if ((Math.abs(e - a) == Math.abs(f - b)) || Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            if ((Math.abs(e - c) == Math.abs(f - d)) || (Math.abs(e - c) == 0) || (Math.abs(f - d) == 0)) {
                System.out.println("black queen kill white queen");
            } else {
                System.out.println("white queen can go");
            }
        } else {
            System.out.println("Incorrect input for queen");
        }
        System.out.print("6. Condition for white queen and black rook: ");
        if ((Math.abs(e - a) == Math.abs(f - b)) || Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            if ((Math.abs(e) == c) || (Math.abs(f) == d)) {
                System.out.println("black rook kill white queen");
            } else {
                System.out.println("white queen can go");
            }
        } else {
            System.out.println("Incorrect input for queen");
        }
        System.out.print("7. Condition for white queen and black knight: ");
        if ((Math.abs(e - a) == Math.abs(f - b)) || Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            if (Math.abs(c - e) == 2 && Math.abs(d - f) == 1 || Math.abs(d - f) == 2 && Math.abs(c - e) == 1) {
                System.out.println("black knight kill white queen");
            } else {
                System.out.println("white queen can go");
            }
        } else {
            System.out.println("Incorrect input for queen");
        }
        System.out.print("8. Condition for white queen and black bishop: ");
        if ((Math.abs(e - a) == Math.abs(f - b)) || Math.abs(a) == Math.abs(e) || Math.abs(b) == Math.abs(f)) {
            if (Math.abs(c - e) == Math.abs(d - f)) {
                System.out.println("black bishop kill white queen");
            } else {
                System.out.println("white queen can go");
            }
        } else {
            System.out.println("Incorrect input for queen");
        }
        System.out.print("9. Condition for white knight and black knight: ");
        if (Math.abs(e - a) == 2 && Math.abs(f - b) == 1 || Math.abs(f - a) == 2 && Math.abs(e - b) == 1) {
            if (Math.abs(c - e) == 2 && Math.abs(d - f) == 1 || Math.abs(d - f) == 2 && Math.abs(c - e) == 1) {
                System.out.println("black knight kill white knight");
            } else {
                System.out.println("white knight can go");
            }
        } else {
            System.out.println("Incorrect input for knight");
        }
        System.out.print("10. Condition for white knight and black rook: ");
        if (Math.abs(e - a) == 2 && Math.abs(f - b) == 1 || Math.abs(f - a) == 2 && Math.abs(e - b) == 1) {
            if (Math.abs(e) == Math.abs(c) || Math.abs(f) == Math.abs(d)) {
                System.out.println("black rook kill white knight");
            } else {
                System.out.println("white knight can go");
            }
        } else {
            System.out.println("Incorrect input for knight");
        }
        System.out.print("11. Condition for white knight and black queen: ");
        if (Math.abs(e - a) == 2 && Math.abs(f - b) == 1 || Math.abs(f - a) == 2 && Math.abs(e - b) == 1) {
            if ((Math.abs(e - c) == Math.abs(f - d)) || (Math.abs(e - c) == 0) || (Math.abs(f - d) == 0)) {
                System.out.println("black queen kill white knight");
            } else {
                System.out.println("white knight can go");
            }
        } else {
            System.out.println("Incorrect input for knight");
        }
        System.out.print("12. Condition for white knight and black bishop: ");
        if (Math.abs(e - a) == 2 && Math.abs(f - b) == 1 || Math.abs(f - a) == 2 && Math.abs(e - b) == 1) {
            if (Math.abs(c - e) == Math.abs(d - f)) {
                System.out.println("black bishop kill white knight");
            } else {
                System.out.println("white knight can go");
            }
        } else {
            System.out.println("Incorrect input for knight");
        }
        System.out.print("13. Condition for white bishop and black bishop: ");
        if (Math.abs(e - a) == Math.abs(f - b)) {
            if (Math.abs(c - e) == Math.abs(d - f)) {
                System.out.println("black bishop kill white bishop");
            } else {
                System.out.println("white bishop can go");
            }
        } else {
            System.out.println("Incorrect input for bishop");
        }
        System.out.print("14. Condition for white bishop and black queen: ");
        if (Math.abs(e - a) == Math.abs(f - b)) {
            if ((Math.abs(e - c) == Math.abs(f - d)) || (Math.abs(e - c) == 0) || (Math.abs(f - d) == 0)) {
                System.out.println("black queen kill white bishop");
            } else {
                System.out.println("white bishop can go");
            }
        } else {
            System.out.println("Incorrect input for bishop");
        }
        System.out.print("15. Condition for white bishop and black knight: ");
        if (Math.abs(e - a) == Math.abs(f - b)) {
            if (Math.abs(c - e) == 2 && Math.abs(d - f) == 1 || Math.abs(d - f) == 2 && Math.abs(c - e) == 1) {
                System.out.println("black knight kill white bishop");
            } else {
                System.out.println("white bishop can go");
            }
        } else {
            System.out.println("Incorrect input for bishop");
        }
        System.out.print("16. Condition for white bishop and black rook: ");
        if (Math.abs(e - a) == Math.abs(f - b)) {
            if (Math.abs(e) == Math.abs(c) || Math.abs(f) == Math.abs(d)) {
                System.out.println("black rook kill white bishop");
            } else {
                System.out.println("white bishop can go");
            }
        } else {
            System.out.println("Incorrect input for bishop");
        }
        System.out.print("17. Condition for white king and black bishop: ");
        if (Math.abs(a - e) == 1 || Math.abs(b - f) == 1) {
            if (Math.abs(c - e) == Math.abs(d - f)) {
                System.out.println("black bishop can kill white king");
            } else {
                System.out.println("white king can go");
            }
        } else {
            System.out.println("Incorrect input for king");
        }
        System.out.print("18. Condition for white king and black queen: ");
        if (Math.abs(a - e) == 1 || Math.abs(b - f) == 1) {
            if ((Math.abs(e - c) == Math.abs(f - d)) || (Math.abs(e - c) == 0) || (Math.abs(f - d) == 0)) {
                System.out.println("black queen can kill white king");
            } else {
                System.out.println("white king can go");
            }
        } else {
            System.out.println("Incorrect input for king");
        }
        System.out.print("19. Condition for white king and black knight: ");
        if (Math.abs(a - e) == 1 || Math.abs(b - f) == 1) {
            if (Math.abs(c - e) == 2 && Math.abs(d - f) == 1 || Math.abs(d - f) == 2 && Math.abs(c - e) == 1) {
                System.out.println("black knight can kill white king");
            } else {
                System.out.println("white king can go");
            }
        } else {
            System.out.println("Incorrect input for king");
        }
        System.out.print("20. Condition for white king and black rook: ");
        if (Math.abs(a - e) == 1 || Math.abs(b - f) == 1) {
            if (Math.abs(e) == Math.abs(c) || Math.abs(f) == Math.abs(d)) {
                System.out.println("black rook can kill white king");
            } else {
                System.out.println("white king can go");
            }
        } else {
            System.out.println("Incorrect input for king");
        }
    }
}
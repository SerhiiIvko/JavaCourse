package classworks.dec262017.task1;

import java.util.Scanner;

public class GraphicPoints {
    public static void main(String[] args) {
        System.out.println("input x and y coordinates");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        scanner.close();

        if (x < -2 && y > 1) {
            System.out.println("Point in area");
        } else {
            System.out.println("Point not in area");
        }

        if ((x >= 0 && x <= 0) && (y < 1.5 && y > -2)) {
            System.out.println("Point in area");
        } else {
            System.out.println("Point not in area");
        }

        if ((x > 2 && y <= 0) || (x > 1 && y < -1)) {
            System.out.println("Point in area");
        } else {
            System.out.println("Point not in area");
        }

        if ((x > 2 && y > 1) || (x > 2 && y < -1.5)) {
            System.out.println("Point in area");
        } else {
            System.out.println("Point not in area");
        }

        if (x > 1 && y > 1 && y < 4) {
            System.out.println("Point in area");
        } else {
            System.out.println("Point not in area");
        }
    }
}

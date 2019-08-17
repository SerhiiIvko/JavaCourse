package classworks.controlWork28dec.task4;

/**
 * 4.Записать условие, которое является истинным, когда точка с координатами x, y попадает в
 * заштрихованные участки проскости.
 */
public class CoordinatePoint {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        if ((x > 1 && x < 4) && (y > 2 && y < 4)) {
            System.out.println("Point in area");
        }

        if ((x > 2 && y < 1) && (x < -1 && y > 1)) {
            System.out.println("Point in area");
        }

        if ((x > 1 && x < 3) && (y < 1 && y > -3)) {
            System.out.println("Point in area");
        }

        if ((x < 1 && y > 1.5) && (x > 1 && y > -2) && (x < 2.5 && y > 1.5)) {
            System.out.println("Point in area");
        }
    }
}

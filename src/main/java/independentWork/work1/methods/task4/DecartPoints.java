package independentWork.work1.methods.task4;

/**
 * Найти расстояние между двумя точками в двумерном декартовом пространстве.
 */
public class DecartPoints {
    public static void main(String[] args) {
        System.out.println(getDistance(5, 8, 9, 15));
    }

    public static float getDistance(double x1, double y1, double x2, double y2) {
        float distance;
        double x = x2 - x1;
        double y = y2 - y1;
        distance = (float) Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
        return distance;
    }
}

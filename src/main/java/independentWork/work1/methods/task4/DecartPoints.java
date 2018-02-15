package independentWork.work1.methods.task4;

/**
 * Найти расстояние между двумя точками в двумерном декартовом пространстве.
 */
public class DecartPoints {
    public static void main(String[] args) {
        //значение переменных может быть получено через сканер или другим способом!
        System.out.println(getDistance(5, 8, 9, 15));
    }

    public static float getDistance(double xFirstPoint, double yFirstPoint, double xSecondPoint, double ySecondPoint) {
        double x = xSecondPoint - xFirstPoint;
        double y = ySecondPoint - yFirstPoint;
        return (float) (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
    }
}
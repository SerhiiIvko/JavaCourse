package independentWork.ifelseTasks.task2;

/**
 * Определить какой четверти принадлежит точка с координатами (х,у)
 */
public class FoundCoordinate {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if (x > 0 && y > 0) {
            System.out.println("Point in 1 quote");
        } else if (x > 0 && y < 0) {
            System.out.println("Point int 2nd quote");
        } else if (x < 0 && y < 0) {
            System.out.println("Point in 3d quote");
        } else if (x < 0 && y > 0) {
            System.out.println("Point in 4th quote");
        } else {
            System.out.println("Point is zero");
        }
    }
}

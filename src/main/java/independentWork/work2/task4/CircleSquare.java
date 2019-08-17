package independentWork.work2.task4;

//Посчитать площадь круга для заданного радиуса R.

public class CircleSquare {
    public static void main(String[] args) {
        int radius = 3;
        double pi = 3.14;
        double square = pi * (Math.pow(radius, 2));

        System.out.println(square);
    }
}

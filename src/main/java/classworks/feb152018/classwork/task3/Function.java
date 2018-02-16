package classworks.feb152018.classwork.task3;

public class Function {
    static double getY1(int x) {
        return ((Math.exp(x) + Math.exp(-x))) / 2;
        //натуральный логарифм по основанию и аргументу-показателю
        // степени, где е иррациональная константа, равная примерно 2,71828
    }

    static double getY2(int x) {
        return (Math.pow(x, 2) + (Math.pow(x, 3))) / 4;
    }

    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        for (int x = 0; x <= 10; x++) {
            double valueY1 = getY1(x);
            double valueY2 = getY2(x);
            sum1 += valueY1;
            sum2 += valueY2;
        }
        System.out.println(sum2);
        System.out.println(sum1);
        if (sum1 > sum2) {
            System.out.println("sum1 > sum2");
        }
        if (sum1 < sum2) {
            System.out.println("sum1 < sum2");
        }
        if (sum1 == sum2) {
            System.out.println("sum1 = sum2");
        }
    }
}
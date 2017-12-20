package homeworks.module2part1.task3;
/**
 * Задание 4.  Записать следующие выражения (используя Java операторы и класс Math):
 */
public class ClassMath {
    public static void main(String[] args) {
        double x = 4;
        double y = 3;

        double xMultiply2 = x * 2;
        double sin = Math.sin(x);
        double pow = Math.pow(x, 2);
        double sqrt = Math.sqrt(x);
        double abs = Math.abs(x);
        double fiveTimesCos = Math.cos(x) * 5;
        double multiplyTo7and5 = Math.pow(x, 2) * (-7.5);
        double sqrtTimes3 = Math.sqrt(x) * 3;
        double sumCosXandY = (Math.sin(x) * Math.cos(y)) + (Math.cos(x) * Math.sin(y));
        double timesYsquareRoot = Math.sqrt(y * 2) * x;
        double threeTimesSinXcosY = (Math.sin(x * 2) * 3) * (Math.cos(y * 3));
        double mnogoVsego = (Math.sqrt(x + Math.sqrt(y))) * (-5);

        System.out.println(xMultiply2);
        System.out.println(sin);
        System.out.println(pow);
        System.out.println(sqrt);
        System.out.println(abs);
        System.out.println(fiveTimesCos);
        System.out.println(multiplyTo7and5);
        System.out.println(sqrtTimes3);
        System.out.println(sumCosXandY);
        System.out.println(timesYsquareRoot);
        System.out.println(threeTimesSinXcosY);
        System.out.println(mnogoVsego);
    }
}


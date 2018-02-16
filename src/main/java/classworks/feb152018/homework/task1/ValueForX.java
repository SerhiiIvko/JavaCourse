package classworks.feb152018.homework.task1;

/**
 * Рассчитать значение x, определив и использовав необходимый метод
 */
public class ValueForX {
    public static double getValueFirst(int num1, int num2, int num3) {
        return (((Math.sqrt(num1) + num1) / 2) + ((Math.sqrt(num2) + num2) / 2) + ((Math.sqrt(num3) + num3) / 2));
    }

    public static double getValueSecond(int num1, int num2, int num3, int num4, int num5, int num6) {
        return ((Math.sqrt(num1) + num1) / (Math.sqrt(num2) + num2)) + ((Math.sqrt(num3) + num3) / (Math.sqrt(num4) + num4)) +
                ((Math.sqrt(num5) + num5 / (Math.sqrt(num6) + num6)));
    }

    public static double getValueThird(int num1, int num2, int num3, int num4, int num5, int num6) {
        return ((Math.sqrt(num2) + num1) / (Math.sqrt(num1) + num2)) + ((Math.sqrt(num4) + num3) / (Math.sqrt(num3) + num4)) +
                ((Math.sqrt(num6) + num5 / (Math.sqrt(num5) + num6)));
    }

    public static void main(String[] args) {
        System.out.println("Value of x = " + getValueFirst(6, 13, 21));
        System.out.println("Value of x = " + getValueSecond(5, 7, 12, 8, 31, 2));
        System.out.println("Value of x = " + getValueThird(8, 15, 12, 6, 21, 7));
        System.out.println("Value of x = " + getValueThird(7, 13, 12, 15, 21, 32));
    }
}
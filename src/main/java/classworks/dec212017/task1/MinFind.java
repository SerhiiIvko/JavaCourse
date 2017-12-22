package classworks.dec212017.task1;

/**
 * Created by ivko on 21.12.17.
 */
public class MinFind {
    public static void main(String[] args) {
        int number1 = 34;
        int number2 = 45;
        int number3 = 23;
        int number4 = 12;
        int min1;
        int min2;
        min1 = Math.min(number1, number2);
        min2 = Math.min(number3, number4);
        if (min1 < min2) {
            System.out.println(min1);
        } else {
            System.out.println(min2);
        }
    }
}

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
        int min = number1;

        if (number2 < min) {
            min = number2;
        } else if (number3 < min) {
            min = number3;
        } else if (number4 < min) {
            min = number4;
        } else {
            min = number1;
        }
        System.out.println(min);
    }
}

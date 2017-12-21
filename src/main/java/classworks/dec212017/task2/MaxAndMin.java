package classworks.dec212017.task2;

/**
 * Created by ivko on 21.12.17.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        int number1 = 34;
        int number2 = 89;
        int number3 = 97;
        int number4 = 8;
        int number5 = 42;

        int min = number1;
        int max = number2;

        if (number2 < min) {
            min = number2;
        } else if (number3 < min) {
            min = number3;
        } else if (number4 < min) {
            min = number4;
        } else {
            min = number5;
        }

        if (number1 > max) {
            max = number1;
        } else if (number3 > max) {
            max = number3;
        } else if (number4 > max) {
            max = number4;
        } else {
            max = number5;
        }

        System.out.println(min);
        System.out.println(max);
    }
}

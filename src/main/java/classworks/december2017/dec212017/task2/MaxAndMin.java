package classworks.december2017.dec212017.task2;

public class MaxAndMin {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 89;
        int number3 = 97;
        int number4 = 8;
        int number5 = 42;

        int min;
        int max;

        int temp1;
        int temp2;
        int temp3;

        temp1 = Math.min(number1, number2);
        temp2 = Math.min(number3, number4);
        if (temp1 < temp2) {
            temp3 = temp1;
        } else {
            temp3 = temp2;
        }
        min = Math.min(number5, temp3);
        System.out.println(min);

        temp1 = Math.max(number1, number2);
        temp2 = Math.max(number3, number4);
        if (temp1 > temp2) {
            temp3 = temp1;
        } else {
            temp3 = temp2;
        }
        max = Math.max(temp3, number5);
        System.out.println(max);
    }
}

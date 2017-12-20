package homeworks.module2part2.task4;

/**
 * Задание 4. Дано двухзначное число. Найти:
 * А) число десятков в нем;
 * Б) число единиц в нём;
 * В) сумму его цифр;
 * Г) произведение его цифр.
 */
public class Multitask {
    public static void main(String[] args) {
        int a = 12;
        int tens = a / 10;
        int ones = 0;
        int sum = (a / 10) + (a % 10);
        int multiply = (a / 10) * (a % 10);
        if ((a / 10 == 1) || (a % 10 == 1)) {
            ones++;
            System.out.println("Number contain " + ones + " ones.");
        } else {
            System.out.println("Number not contains 1!");
        }
        System.out.println();
        System.out.println(tens);
        System.out.println(sum);
        System.out.println(multiply);
    }
}


package classworks.december2017.dec192017.module3.task4;

/**
 * Задача 4: В трехзначном числе зачеркнули его последнюю цифру. В оставшимся двухзначном числе
 * переставили цифры. Затем приписали к ним слева последнюю цифру числа x, то получили число 654.
 * Какое число было изначальным? Вывести его на экран.
 */
public class SwapTwoFromThree {
    public static void main(String[] args) {
        int number;
        int result = 654;
        int a = result / 100;
        int b = (result / 10) % 10;
        int c = result % 10;
        int tmp;

        tmp = a;
        a = b;
        b = tmp;
        number = (a * 100) + (b * 10) + c;

        System.out.println(number);
    }
}

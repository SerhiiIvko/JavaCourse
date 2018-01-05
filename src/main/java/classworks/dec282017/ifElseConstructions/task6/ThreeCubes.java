package classworks.dec282017.ifElseConstructions.task6;

/**
 * 6.Дано трехзначное число. Определить, равен ли квадрат этого числа сумме кубов его цифр.
 */
public class ThreeCubes {
    public static void main(String[] args) {
        int number = 444;

        int a = number % 10;
        number = number / 10;
        int b = number % 10;
        number = number / 10;
        int c = number % 10;

        System.out.println((Math.pow(number, 2)) == ((Math.pow(a, 3)) + (Math.pow(b, 3)) + (Math.pow(c, 3))) ? "Yes" : "No");
    }
}

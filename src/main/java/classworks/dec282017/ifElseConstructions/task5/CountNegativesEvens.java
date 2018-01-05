package classworks.dec282017.ifElseConstructions.task5;

/**
 * 5.Сгенерируйте четыре целых числа. Определить:
 * a.сколько из них отрицательных
 * b.сколько из них четных
 */
public class CountNegativesEvens {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 20) - 10;
        int number2 = (int) (Math.random() * 20) - 10;
        int number3 = (int) (Math.random() * 20) - 10;
        int number4 = (int) (Math.random() * 20) - 10;
        System.out.println("Numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4);
        int countNegatives = 0;
        int countEvens = 0;

        if (number1 < 0) {
            countNegatives++;
        }
        if (number2 < 0) {
            countNegatives++;
        }
        if (number3 < 0) {
            countNegatives++;
        }
        if (number4 < 0) {
            countNegatives++;
        }
        System.out.println("Count of negative numbers " + countNegatives);

        if (number1 % 2 == 0) {
            countEvens++;
        }
        if (number2 % 2 == 0) {
            countEvens++;
        }
        if (number3 % 2 == 0) {
            countEvens++;
        }
        if (number4 % 2 == 0) {
            countEvens++;
        }
        System.out.println("Count of evens numbers " + countEvens);
    }
}

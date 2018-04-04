package classworks.december2017.dec282017.ternar.task4;

/**
 * 4.Даны 3 целых числа a, b, c.  Ответить на вопросы:
 * a.является ли число a больше чисел b и c.
 * b.является ли число b больше чисел a и c.
 * c.является ли число c больше чисел a и b.
 * d.являются ли числа одинаковы.
 */
public class ThreeNumbers {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 50);
        int b = (int) (Math.random() * 50);
        int c = (int) (Math.random() * 50);

        System.out.println(a + " " + b + " " + c);
        System.out.println(a > b && a > c ? "a is max" : "a is not max");
        System.out.println(b > a && b > c ? "b is max" : "b is not max");
        System.out.println(c > a && c > b ? "c is max" : "c is not max");
        System.out.println(a == b && a == c ? "digits are equals" : "digits are not equals");
    }
}

package homeworks.module2part2.task5;

/**
 * Задание 5*. Из трёхзначного числа x вычли его последнюю цифру. Когда результат разделили
 * на 10, а к частному слева приписали последнюю цифру числа x, то получили 237. Найти число
 * x и вывести на экран.
 */
public class Last {
    public static void main(String[] args) {

        int output = 237;
        int firstNumber = output / 100;
        int leftPart = output - (firstNumber * 100);
        int input = leftPart * 10 + firstNumber;
        System.out.println(String.format("Было введено число %d", input));
    }
}

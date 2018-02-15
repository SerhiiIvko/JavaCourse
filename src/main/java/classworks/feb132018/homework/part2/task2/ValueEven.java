package classworks.feb132018.homework.part2.task2;

/**
 * Написать функцию, которая возвращает истину, если передаваемое значение положительное и ложь, если отрицательное.
 */
public class ValueEven {
    public static boolean isValueEven(int value) {
        return (value % 2 == 0);
    }

    public static void main(String[] args) {
        int value = 3;
        System.out.println(isValueEven(value));
    }
}
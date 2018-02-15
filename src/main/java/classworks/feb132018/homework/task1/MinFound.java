package classworks.feb132018.homework.task1;

/**
 * Напишите метод, чтобы найти наименьшее число среди трех чисел. 
 * Например:
 * Введите первый номер: 25 
 * Введите второй номер: 37 
 * Введите третий номер: 29 
 * <p>
 * Ожидаемый результат:
 * Наименьшее значение - 25,0
 */
public class MinFound {
    public static int getMinValue(int a, int b, int c) {
        int min = a;
        if (b < a && b < c) {
            min = b;
        }
        if (c < b && c < a) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(getMinValue(25, 37, 29));
    }
}
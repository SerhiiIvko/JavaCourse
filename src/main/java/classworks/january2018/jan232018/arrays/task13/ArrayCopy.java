package classworks.january2018.jan232018.arrays.task13;

/**
 * Создать массив на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 20. Создать копию первого массива.
 * Вывести оба массива на экран. Увеличить все элементы второго массива в 2 раза. Вывести оба массива на экран.
 * (Ожидаемый результат: только элементы второго массива должны быть изменены)
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 21));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = array[i];
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] *= 2;
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();
    }
}

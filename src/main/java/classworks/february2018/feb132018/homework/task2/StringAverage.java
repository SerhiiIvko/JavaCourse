package classworks.february2018.feb132018.homework.task2;

/**
 * Напишите метод для отображения среднего символа строки.
 * Примечание: а) Если длина строки четна, будут два средних символа. 
 * б) Если длина строки равна, то будет один средний символ. 
 * Данные теста: 
 * Введите строку: Hello World!!!
 * <p>
 * Ожидаемый результат:
 * <p>
 * Средний символ в строке: Wo
 */
public class StringAverage {
    public static String getAverageOfString(String string) {
        String average;
        if (string.length() % 2 == 0) {
            average = String.valueOf(string.charAt(string.length() / 2 - 1)).concat(String.valueOf(string.charAt(string.length() / 2)));
        } else {
            average = String.valueOf(string.charAt(string.length() / 2));
        }
        return average;
    }

    public static void main(String[] args) {
        System.out.println(getAverageOfString("wowowowowowoww"));
    }
}
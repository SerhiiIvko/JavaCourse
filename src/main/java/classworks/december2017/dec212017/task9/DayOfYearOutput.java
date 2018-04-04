package classworks.december2017.dec212017.task9;

/**
 * 6.Генерируем 2 числа. Первый в диапазоне от 1 до 31, второе от 1 до 12.
 * 1.Сообщаем пользователю если сгенерированые число и месяц не являются корректной датой и выводим их
 * (например: «Дата: 30 февраля  - не является валидной.»)
 * 2.Если дата валидна вывести её на экран в формате «4 апреля».
 */
public class DayOfYearOutput {
    public static void main(String[] args) {
        int date = (int) (1 + Math.random() * 31);
        int month = (int) (1 + Math.random() * 12);

        if (month == 1 && date <= 31) {
            System.out.println(date + " January");
        } else if (month == 2 && date <= 28) {
            System.out.println(date + " February");
        } else if (month == 3 && date <= 31) {
            System.out.println(date + " March");
        } else if (month == 4 && date <= 30) {
            System.out.println(date + " April");
        } else if (month == 5 && date <= 31) {
            System.out.println(date + " May");
        } else if (month == 6 && date <= 30) {
            System.out.println(date + " June");
        } else if (month == 7 && date <= 31) {
            System.out.println(date + " July");
        } else if (month == 8 && date <= 31) {
            System.out.println(date + " August");
        } else if (month == 9 && date <= 30) {
            System.out.println(date + " September");
        } else if (month == 10 && date <= 31) {
            System.out.println(date + " October");
        } else if (month == 11 && date <= 30) {
            System.out.println(date + " November");
        } else if (month == 12 && date <= 31) {
            System.out.println(date + " December");
        } else {
            System.out.println(date + " is not valid date for " + month);
        }
    }
}

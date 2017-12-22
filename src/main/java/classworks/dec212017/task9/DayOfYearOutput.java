package classworks.dec212017.task9;

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

        switch (month) {
            case 1:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " January");
                }
                break;
            case 2:
                if (date >= 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " February");
                }
                break;
            case 3:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " March");
                }
                break;
            case 4:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " April");
                }
                break;
            case 5:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " May");
                }
                break;
            case 6:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " June");
                }
                break;
            case 7:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " July");
                }
                break;
            case 8:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " August");
                }
                break;
            case 9:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " September");
                }
                break;
            case 10:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " October");
                }
                break;
            case 11:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " November");
                }
                break;
            case 12:
                if (date > 30) {
                    System.out.println("Date is not valid");
                } else {
                    System.out.println(date + " December");
                }
                break;
        }
    }
}

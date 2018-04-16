package classworks.march2018.mar292018.homework.task2;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;

/**
 * Создать объект класса Год, используя классы Месяц, День. Методы: задать дату, вывести на консоль день недели по
 * заданной дате, рассчитать количество дней, месяцев в заданном временном промежутке.
 * 1. Задать дату
 * 2. Вывести день недели по заданной дате
 * 3. Ввести начало промежутка и конец
 * 4. посчитать количество месяцев и дней в промежутке
 */
public class YearRunner {
    public static void main(String[] args) {
        System.out.println("Введите число, месяц и год: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println("Заданной дате соответствует - " + CalendarUtils.getWeekDayByDate(day, month, year));
        System.out.println("Введите дату начала промежутка (число, месяц, год): ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        LocalDate localDate1 = LocalDate.of(year, month, day);
        System.out.println("Введите дату конца промежутка (число, месяц, год): ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        LocalDate localDate2 = LocalDate.of(year, month, day);
        scanner.close();
        String duration = " ";
        try {
            duration = "В данном промежутке " + CalendarUtils.getDaysInRange(localDate1, localDate2);
        } catch (ParseException pe) {
            System.out.println("Incorrect data");
        }
        System.out.println(duration);
    }
}
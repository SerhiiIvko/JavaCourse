package classworks.march2018.mar292018.homework.task2;

import java.util.Scanner;

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
//        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
//        int month = scanner.nextInt();
//        int year = scanner.nextInt();
        Year y = new Year();

        System.out.println(y.printDayOfWeek(y.dayOfWeek()));

    }
}
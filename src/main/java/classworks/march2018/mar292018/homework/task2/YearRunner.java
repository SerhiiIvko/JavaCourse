package classworks.march2018.mar292018.homework.task2;

/**
 * Создать объект класса Год, используя классы Месяц, День. Методы: задать дату, вывести на консоль день недели по
 * заданной дате, рассчитать количество дней, месяцев в заданном временном промежутке.
 */
public class YearRunner {
    public static void main(String[] args) {
        Year year = new Year(31, 12, 2017);
        Year year1 = new Year(2, 5, 2017);

        System.out.println(year.getCountDaysInRange(year1));
        System.out.println(year.getCountMonthsInRange(year1));
        System.out.println(year.toString());
    }
}
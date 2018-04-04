package classworks.march2018.mar062018.homework.task1;

/**
 * Создайте класс Date, у которого будут приватные поля - месяц, день и год.
 * В вашем классе должен быть конструктор, который инициализирует три переменные экземпляра и предполагает, что
 * предоставленные значения верны.
 * Создайте геттеры и сеттеры для каждой переменной класса.
 *   Создайте метод displayDate, который отображает месяц, день и год, разделенные косой чертой (/).
 * Напишите тестовое приложение с именем DateTest, которое демонстрирует возможности ClassDate.
 * (Пользователь вводит день месяц и год)
 */
public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        boolean isIntercalary = (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
        if ((isIntercalary && month == 2 && day > 29) || !isIntercalary && month == 2 && day > 28) {
            System.out.println("Incorrect February input!");
        } else if (day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            System.out.println("Incorrect day input!");
        } else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Incorrect day input!");
        } else {
            this.month = month;
            this.day = day;
            this.year = year;
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        if (getMonth() == 0 || getDay() == 0 || getYear() == 0) {
            System.out.println("Date can't be displayed");
        } else {
            System.out.println("Date: " + getMonth() + "/" + getDay() + "/" + getYear());
        }
    }
}
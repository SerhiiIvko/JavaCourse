package classworks.march2018.mar292018.homework.task2;

public class Year {
    private int day;
    private int month;
    private int year;

    public Year(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountDaysInRange(Year that) {
        return Math.abs(that.getDay() - this.getDay());
    }

    public int getCountMonthsInRange(Year that) {
        return Math.abs(that.getMonth() - this.getMonth());
    }

    @Override
    public String toString() {
        return "Date: " + day + "." + month + "." + year;
    }
}
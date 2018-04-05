package classworks.march2018.mar292018.homework.task2;

import java.util.Calendar;
import java.util.Date;

public class Year {
    private int day;
    private int month;
    private int year;

    public Year() {

    }

    public Year(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean getIsYearIntercalary(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public int dayOfWeek() {
        Date yourDate = new Date();
        yourDate.getDate();
        Calendar c = Calendar.getInstance();
        c.setTime(yourDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//        System.out.println(yourDate.toString());
        return dayOfWeek;
    }

    public String printDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Monday";
            case 5:
                return "Tuesday";
            default:
                System.out.println("Incorrect date");
        }
        throw new IllegalArgumentException();
    }
}
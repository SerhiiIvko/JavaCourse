package classworks.march2018.mar292018.homework.task2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarUtils {

    public static String getWeekDayByDate(int day, int month, int year) {
        boolean isIntercalary = (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
        if (isIntercalary && month == 2 && day > 29) {
            return "Incorrect input!";
        } else if (day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            return "Incorrect input!";
        } else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return "Incorrect input!";
        }
        if (month < 0 || month > 12) {
            return "Incorrect input!";
        } else {
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            Locale locale = Locale.getDefault();
            calendar.set(year, month - 1, day);
            return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
        }
    }

    public static String getDaysInRange(LocalDate localDate1, LocalDate localDate2)
            throws ParseException {
        Period period = Period.between(localDate1, localDate2);
        int days = Math.abs(period.getDays());
        int months = Math.abs(period.getMonths());
        int years = Math.abs(period.getYears());
        String result;
        if (days == 0 && months == 0 && years == 0) {
            result = "нет разницы";
        } else {
            StringBuilder resultBuilder = new StringBuilder();
            if (days != 0) {
                resultBuilder.append(days).append(" дней ");
            }
            if (months != 0) {
                resultBuilder.append(months).append(" месяцев ");
            }
            if (years != 0) {
                resultBuilder.append(years).append(" лет ");
            }
            if (resultBuilder.length() > 0) {
                resultBuilder.setLength(resultBuilder.length() - 1);
            }
            result = resultBuilder.toString();
        }
        return result;
    }
}
package classworks.march2018.mar292018.homework.task2;

import java.util.Scanner;

public class Month {

//System.out.println("Input: year, month, day");
//    Scanner scanner = new Scanner(System.in);
//    int year = scanner.nextInt();
//    int month = scanner.nextInt();
//    int day = scanner.nextInt();
//        scanner.close();
//
//    int tomorrowDay = -1;
//    int tomorrowMonth = -1;
//    int tomorrowYear = -1;
//
//    boolean isIntercalary = (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
//
//        if (isIntercalary && month == 2 && day > 29) {
//        System.out.println("Incorrect input!");
//        return;
//    } else if (day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
//        System.out.println("Incorrect input!");
//        return;
//    } else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
//        System.out.println("Incorrect input!");
//        return;
//    }
//
//        if (day == 31) {
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
//            tomorrowDay = 1;
//            tomorrowMonth = month + 1;
//        } else if (month == 12) {
//            tomorrowDay = 1;
//            tomorrowMonth = 1;
//            tomorrowYear = year + 1;
//        } else {
//            System.out.println("Incorrect input data: " + day + "." + month + "." + year);
//            return;
//        }
//    } else if (day == 30) {
//        if (month == 4 || month == 6 || month == 9 || month == 10) {
//            tomorrowDay = 1;
//            tomorrowMonth = month + 1;
//        }
//    } else if (((day == 29 && isIntercalary) || (day == 28 && !isIntercalary)) && month == 2) {
//        tomorrowDay = 1;
//        tomorrowMonth = month + 1;
//    }
//
//        if (tomorrowDay == -1) {
//        tomorrowDay = day + 1;
//    }
//        if (tomorrowMonth == -1) {
//        tomorrowMonth = month;
//    }
//        if (tomorrowYear == -1) {
//        tomorrowYear = year;
//    }
//
//    int yesterdayDay = -1;
//    int yesterdayMonth = -1;
//    int yesterdayYear = -1;
//
//        if (day == 1) {
//        if (month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11) {
//            yesterdayDay = 31;
//            yesterdayMonth = month - 1;
//        } else if (month == 5 || month == 7 || month == 10 || month == 12) {
//            yesterdayDay = 30;
//            yesterdayMonth = month - 1;
//        } else if (month == 3) {
//            yesterdayDay = isIntercalary ? 29 : 28;
//            yesterdayMonth = month - 1;
//        } else if (month == 1) {
//            yesterdayDay = 31;
//            yesterdayMonth = 12;
//            yesterdayYear = year - 1;
//        }
//    }
//
//        if (yesterdayDay == -1) {
//        yesterdayDay = day - 1;
//    }
//        if (yesterdayMonth == -1) {
//        yesterdayMonth = month;
//    }
//        if (yesterdayYear == -1) {
//        yesterdayYear = year;
//    }
//        System.out.println();
//        System.out.println("Previous date: " + yesterdayDay + "." + yesterdayMonth + "." + yesterdayYear);
//        System.out.println("Next date: " + tomorrowDay + "." + tomorrowMonth + "." + tomorrowYear);
}
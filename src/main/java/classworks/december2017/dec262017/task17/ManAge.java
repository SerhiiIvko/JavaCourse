package classworks.december2017.dec262017.task17;

//2.Известны год, номер месяца и день рождения человека, а также год, номер месяца и день сегодняшшнего дня. Определить
// возраст человека (число полных лет).

import java.util.Scanner;

public class ManAge {
    public static void main(String[] args) {
        System.out.println("Input age of man: year, month, day");
        Scanner scanner = new Scanner(System.in);
        int yearOldMan = scanner.nextInt();
        int monthBirthday = scanner.nextInt();
        int dayOfBirthday = scanner.nextInt();
        scanner.close();

        int yearToday = 2017;
        int monthToday = 12;
        int today = 27;
        int ageOfMan = 0;

        if ((yearOldMan < 0 || yearOldMan < (yearToday - 100)) || (monthBirthday < 0 || monthBirthday > 12) || (dayOfBirthday < 0 || dayOfBirthday > 31)) {
            System.out.println("Incorrect input");
            return;
        }

        if (monthToday - monthBirthday >= 0 && today - dayOfBirthday >= 0) {
            ageOfMan = yearToday - yearOldMan;
        } else {
            ageOfMan = (yearToday - yearOldMan) - 1;
        }
        System.out.println(ageOfMan);
    }
}

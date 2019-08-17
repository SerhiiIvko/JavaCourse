package classworks.dec262017.task18;

//3.Известны год, номер месяца и день рождения каждого из двух человек. Определить, кто из них старше.

import java.util.Scanner;

public class TwoMenAge {
    public static void main(String[] args) {
        System.out.println("Input age of two people: year, month, day");
        System.out.println("First man:");
        Scanner scanner = new Scanner(System.in);
        int yearFirstMan = scanner.nextInt();
        int monthFirstMan = scanner.nextInt();
        int dayFirstMan = scanner.nextInt();
        System.out.println("Second man:");
        int yearSecondtMan = scanner.nextInt();
        int monthSecondMan = scanner.nextInt();
        int daySecondMan = scanner.nextInt();
        scanner.close();

        if ((yearFirstMan < 0 || yearSecondtMan < 0) || (monthFirstMan < 0 || monthFirstMan > 12) || (monthSecondMan < 0 || monthSecondMan > 12) || (dayFirstMan < 0 || dayFirstMan > 31) || (daySecondMan < 0 || daySecondMan > 31)) {
            System.out.println("Incorrect input");
            return;
        }

        if (yearFirstMan < yearSecondtMan) {
            System.out.println("First man is older");
        } else if (yearFirstMan == yearSecondtMan && monthFirstMan < monthSecondMan) {
            System.out.println("First man is older");
        } else if (yearFirstMan == yearSecondtMan && monthFirstMan == monthSecondMan && dayFirstMan < daySecondMan) {
            System.out.println("First man is older");
        } else if (yearFirstMan == yearSecondtMan && monthFirstMan == monthSecondMan && dayFirstMan == daySecondMan) {
            System.out.println("People are twins");
        } else {
            System.out.println("Second man is older");
        }
    }
}

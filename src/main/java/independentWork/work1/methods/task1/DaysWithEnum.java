package independentWork.work1.methods.task1;

import java.util.Scanner;

/**
 * Получить строковое название дня недели по номеру дня.(массив, E-num)
 */
public class DaysWithEnum {
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void getDay() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.close();
        switch (day) {
            case 1:
                System.out.println(Days.SUNDAY);
                break;
            case 2:
                System.out.println(Days.MONDAY);
                break;
            case 3:
                System.out.println(Days.TUESDAY);
                break;
            case 4:
                System.out.println(Days.WEDNESDAY);
                break;
            case 5:
                System.out.println(Days.THURSDAY);
                break;
            case 6:
                System.out.println(Days.FRIDAY);
                break;
            case 7:
                System.out.println(Days.SATURDAY);
                break;
            default:
                System.out.println("Input correct number of day!");
        }
    }

    public static void main(String[] args) {
        getDay();
    }
}
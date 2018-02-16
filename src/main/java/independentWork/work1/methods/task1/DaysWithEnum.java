package independentWork.work1.methods.task1;

import java.util.Scanner;

/**
 * Получить строковое название дня недели по номеру дня.(массив, E-num)
 */
public class DaysWithEnum {
    enum Day {
        MONDAY(1, "Monday"),
        TUESDAY(2, "Tuesday"),
        WEDNESDAY(3, "Wednesday"),
        THURSDAY(4, "Thursday"),
        FRIDAY(5, "Friday"),
        SATURDAY(6, "Saturday"),
        SUNDAY(7, "Sunday"),
        UNDEFINED(-1, "Incorrect number");

        private String description;
        private int numberOfDay;

        Day(int numberOfDay, String description) {
            this.numberOfDay = numberOfDay;
            this.description = description;
        }

        public static Day getDayByNumber(int numberOfDay) {
            for (Day day : values()) {
                if (day.numberOfDay == numberOfDay) {
                    return day;
                }
            }
            return UNDEFINED;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public static void getDay() {
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();
        scanner.close();

        System.out.println(Day.getDayByNumber(numberOfDay));

//        switch (numberOfDay) {
//            case 1:
//                System.out.println(Day.SUNDAY);
//                break;
//            case 2:
//                System.out.println(Day.MONDAY);
//                break;
//            case 3:
//                System.out.println(Day.TUESDAY);
//                break;
//            case 4:
//                System.out.println(Day.WEDNESDAY);
//                break;
//            case 5:
//                System.out.println(Day.THURSDAY);
//                break;
//            case 6:
//                System.out.println(Day.FRIDAY);
//                break;
//            case 7:
//                System.out.println(Day.SATURDAY);
//                break;
//            default:
//                System.out.println("Input correct number of numberOfDay!");
//        }
    }

    public static void main(String[] args) {
        getDay();
    }
}
package independentWork.work1.methods.task1;

import java.util.Scanner;

/**
 * Получить строковое название дня недели по номеру дня.(массив, E-num)
 */
public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Input number day of week: ");
        getNameOfDay();
    }

    public static void getNameOfDay() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        int numOfDay = scanner.nextInt();
        scanner.close();
        if (numOfDay < 1 || numOfDay > 7) {
            System.out.println("Input correct number of week!");
        }
        for (int i = 1; i <= days.length; i++) {
            if (numOfDay == i) {
                System.out.println(days[i - 1]);
            }
        }
    }
}
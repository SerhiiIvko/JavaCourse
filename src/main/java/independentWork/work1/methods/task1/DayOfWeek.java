package independentWork.work1.methods.task1;

import java.util.Scanner;

/**
 * Получить строковое название дня недели по номеру дня.(массив, E-num)
 */
public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Input number day of week: ");
        System.out.println(getNameOfDay());
    }

    static String getNameOfDay() {
        Scanner scanner = new Scanner(System.in);
        int numOfDay = scanner.nextInt();
        scanner.close();
        String name = "Input correct number";
        switch (numOfDay) {
            case 1:
                name = "Sunday";
                break;
            case 2:
                name = "Monday";
                break;
            case 3:
                name = "Tuesday";
                break;
            case 4:
                name = "Wednesday";
                break;
            case 5:
                name = "Thursday";
                break;
            case 6:
                name = "Friday";
                break;
            case 7:
                name = "Saturday";
                break;
        }
        return "Day is: " + name;
    }
}
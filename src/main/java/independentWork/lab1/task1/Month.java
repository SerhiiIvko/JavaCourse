package independentWork.lab1.task1;

import java.util.Scanner;

/**
 * Ввести число от 1 до 12. Вывести на консоль название месяца,
 * соответствующего данному числу. (Осуществить проверку корректности
 * ввода чисел)
 */
public class Month {

    public static void getNameOfMonth(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        if (month < 1 || month > 12) {
            System.out.println("Input correct number of month!");
        }
        for (int i = 1; i <= months.length; i++) {
            if (month == i) {
                System.out.println(months[i - 1]);
            }
        }
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int month = -1;
        System.out.println(inviteText);
        while (month < 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only positive digits!");
                scanner.next();
            } else {
                month = scanner.nextInt();
                if (month < 0) {
                    System.out.println("Number must be positive!");
                }
            }
        }
        return month;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = readNumber(scanner, "Input number of month");
        scanner.close();
        getNameOfMonth(month);
    }
}
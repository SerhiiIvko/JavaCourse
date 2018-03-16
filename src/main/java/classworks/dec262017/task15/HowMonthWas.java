package classworks.dec262017.task15;

//3.С начала 1990 года (01.01.90) по некоторый день прошло n (запросить у пользователя) месяцев и 2 дня. Определить
// название месяца.

import java.util.Scanner;

public class HowMonthWas {
    public static void main(String[] args) {
        System.out.println("Input");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int month;

        if (number < 0) {
            System.out.println("Incorrect");
            return;
        }

        if (number > 12) {
            month = number % 12 + 1;
        } else if (number == 12) {
            month = 2;
        } else {
            month = number + 1;
        }

        switch (month) {
            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is February");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is August");
                break;
            case 9:
                System.out.println("Month is September");
                break;
            case 10:
                System.out.println("Month is October");
                break;
            case 11:
                System.out.println("Month is November");
                break;
            case 12:
                System.out.println("Month is December");
                break;
            default:
        }
    }
}
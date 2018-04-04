package classworks.december2017.dec212017.task3;

import java.util.Scanner;

public class MonthFinder {
    public static void main(String[] args) {
        System.out.println("Input month");
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();
        scanner.close();

        if (season == 12 || season == 1 || season == 2) {
            System.out.println("Winter");
        } else if (season == 3 || season == 4 || season == 5) {
            System.out.println("Spring");
        } else if (season == 6 || season == 7 || season == 8) {
            System.out.println("Summer");
        } else if (season == 9 || season == 10 || season == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Your input is incorrect");
        }
        switch (season) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Your input is incorrect");
        }
    }
}

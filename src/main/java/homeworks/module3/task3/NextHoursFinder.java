package homeworks.module3.task3;

import java.util.Scanner;

public class NextHoursFinder {
    public static void main(String[] args) {
        System.out.println("Введите значение от 0 до 360 ");
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextInt();
        scanner.close();

        int circle = 360;
        double oneMinuteCorner = (double) (circle / 12) / 60;
        double minuteCorner = oneMinuteCorner * y;
        double hours = (y / oneMinuteCorner) / 60;
        double minutes = (y / oneMinuteCorner) % 60;

        System.out.println("При введённом значении угла, угол минутной стрелки составит " + minuteCorner
                + " градусов, Часовая стрелка покажет " + (int) hours + " часов, а минутная "
                + (int) minutes + " минут");
    }
}
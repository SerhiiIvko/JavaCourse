package homeworks.module3.task2;

import java.util.Scanner;

public class HoursFinder {
    public static void main(String[] args) {
        System.out.println("Введите значение в градусах от 0 до 359: ");
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextDouble();
        scanner.close();

        int circle = 360;
        int minutesInHour = 60;
        int gradusesInHour = 360 / 12;
        int hours = (int) y / gradusesInHour;
        int minutes = ((int) y * minutesInHour) / circle;

        System.out.println("Данное значение соответствует " + hours + " часам " + minutes + " минутам");
    }
}

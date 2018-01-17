package homeworks.module3.task1;

import java.util.Scanner;

public class CornerFinder {
    public static void main(String[] args) {
        System.out.println("Введите время в диапазоне: часы щт 0 до 23; минуты: от 0 до 59; секунды: от 0 до 59 ");

        Scanner scanner = new Scanner(System.in);
        short h = scanner.nextShort();
        short m = scanner.nextShort();
        short s = scanner.nextShort();
        scanner.close();

        double corner;
        double circle = 360;
        double hour = circle / 12;
        double minute = hour / 60;
        double second = minute / 60;

        corner = (hour * h) + (minute * m) + (second * s);
        System.out.println("Угол между часовой стрелкой и началом суток составит " + corner + " градусов");
    }
}

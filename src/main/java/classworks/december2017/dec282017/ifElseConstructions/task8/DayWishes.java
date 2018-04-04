package classworks.december2017.dec282017.ifElseConstructions.task8;

import java.util.Scanner;

/**
 * 8.Написать программу, которая на ввод времени суток выводит соответствующее пожелание доброго утра, доброго дня,
 * доброго вечера или спокойной ночи.
 */
public class DayWishes {
    public static void main(String[] args) {
        System.out.println("Input time");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        scanner.close();

        if (time < 0 || time > 24) {
            System.out.println("Incorrect input");
            return;
        }

        if (time >= 5 && time <= 10) {
            System.out.println("Good morning!");
        }
        if (time > 10 && time <= 16) {
            System.out.println("Good day!");
        }
        if (time > 16 && time <= 22) {
            System.out.println("Good evening!");
        }
        if (time >= 22 && time <= 24 || time >= 0 && time < 5) {
            System.out.println("Good night!");
        }
    }
}

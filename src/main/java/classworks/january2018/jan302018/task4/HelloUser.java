package classworks.january2018.jan302018.task4;

import java.util.Scanner;

/**
 * 4.Составить программу, которая запрашивает имя пользователя и выводит его на экран с приветствием.
 */
public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Input your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Hello, " + name + "!");
    }
}

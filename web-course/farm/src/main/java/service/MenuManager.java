package service;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuManager {

    public static void showMainMenu() throws SQLException {
        UserManager.getUser();
        System.out.println("Game menu:\n" +
                "1. Choose number of bed for action\n" +
                "2. Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1":
                BedManager.getBedStatus();
                break;
            case "2":
                System.out.println("You successfully quit from game");
                System.exit(1);
                break;
            default:
                System.out.println("Incorrect input");
                showMainMenu();
        }
        scanner.close();
    }
}
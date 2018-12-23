package service;

import java.sql.SQLException;
import java.util.Scanner;

public class BedManager {

    public static void getBedMenu() throws SQLException {
        System.out.println("Bed menu:\n" +
                "1. See bed status\n" +
                "2. Choose number of plant from plant list\n" +
                "3. Pick up harvest\n" +
                "4. Back to main menu");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1":
//                startGame();
                break;
            case "2":
//                new LogLoader().loadHistoryInMemory();
//                mainMenu();
                break;
            case "3":
                MenuManager.showMainMenu();
                break;
            default:
                System.out.println("Incorrect input");
                getBedMenu();
        }
        scanner.close();
    }

    public static void getBedStatus() throws SQLException {
        System.out.println("Bed menu:\n" +
                "1. Input bed number for use Bed menu\n" +
                "2. Back to main menu");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1":
                getBedMenu();
                break;
            case "2":
                MenuManager.showMainMenu();
                break;
            default:
                System.out.println("Incorrect input");
                getBedMenu();
        }
        scanner.close();
    }

    public static void plantingSeed() {

    }

    public static void peekHarvest() {

    }
}
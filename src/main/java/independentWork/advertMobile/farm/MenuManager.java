package independentWork.advertMobile.farm;

import java.util.Scanner;

public class MenuManager {

    private static void showMainMenu() {
        GameField.initField();
        System.out.println("Game menu:\n" +
                "1. Choose number of bed for action\n" +
                "2. Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1":
//                String [] field = GameField.initField();
                for (int i = 0; i < GameField.SIZE; i++) {


                }
                bedMenu();
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

    private static void bedMenu() {
        System.out.println("Bed menu:\n" +
                "1. Choose number of plant from plant list\n" +
                "2. Pick up harvest\n" +
                "3. Back to main menu");
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
                showMainMenu();
                break;
            default:
                System.out.println("Incorrect input");
                bedMenu();
        }
        scanner.close();
    }
}
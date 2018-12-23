package independentWork.advertMobile.zeroAndCruix;

import java.util.Scanner;

public class TicTacToeGame {
    private static final int SIZE = 3;

    static int getSIZE() {
        return SIZE;
    }

    void mainMenu() {
        System.out.println("Game menu:\n" +
                "1. Start new game\n" +
                "2. Show history\n" +
                "3. Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    startGame();
                    break;
                case "2":
                    new LogLoader().loadHistoryInMemory();
                    mainMenu();
                    break;
                case "3":
                    System.out.println("You successfully quit from game");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Incorrect input");
                    mainMenu();
            }
        scanner.close();
    }

    private static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] field = new String[SIZE][SIZE];
        int playerIndex = 2;
        int quitIndex = 0;
        String player1;
        String player2;
        String cellPattern = " [ ] ";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = (cellPattern);
            }
        }
        showField(field);
        System.out.println("Player 1, input your name, please: ");
        player1 = scanner.nextLine();
        System.out.println("Player 2, input your name, please: ");
        player2 = scanner.nextLine();
        while ((playerIndex < 11) && (quitIndex == 0)) {
            if (playerIndex % 2 == 0) {
                System.out.println("\n" + player1 + ", put X in the cell");
            } else {
                System.out.println("\n" + player2 + ", put O in the cell");
            }
            System.out.print("Input number of the cell:> ");
            String errorMessage = "This cell is not empty, try again.";

            switch (scanner.next()) {
                case "1": {
                    if (field[0][0].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[0][0] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[0][0] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "2": {
                    if (field[0][1].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[0][1] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[0][1] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "3": {
                    if (field[0][2].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[0][2] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[0][2] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "4": {
                    if (field[1][0].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[1][0] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[1][0] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "5": {
                    if (field[1][1].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[1][1] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[1][1] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "6": {
                    if (field[1][2].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[1][2] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[1][2] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "7": {
                    if (field[2][0].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[2][0] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[2][0] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "8": {
                    if (field[2][1].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[2][1] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[2][1] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                case "9": {
                    if (field[2][2].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[2][2] = (" [X] ");
                            playerIndex++;
                            break;
                        } else {
                            field[2][2] = (" [O] ");
                            playerIndex++;
                            break;
                        }
                    } else {
                        System.out.println(errorMessage);
                        break;
                    }
                }
                default:
                    System.out.println("\nInput error, try again!");
                    break;
            }
            showField(field);
            quitIndex = new WinnerChecker(field, quitIndex, player1, player2).checkWinner();

        }
        System.out.println();
        scanner.close();
    }

    private static void showField(String[][] field) {
        System.out.print("Current field statement");
        for (int p = 0; p < SIZE; p++) {
            System.out.println();
            System.out.println();
            for (int l = 0; l < SIZE; l++) {
                System.out.print(field[p][l]);
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Do you want to continue? ");
            input = scanner.next();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println();
                new TicTacToeGame().mainMenu();
            } else if (input.equalsIgnoreCase("N")) {
                System.out.println("Game over");
                break;
            }
        } while (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y"));
    }
}
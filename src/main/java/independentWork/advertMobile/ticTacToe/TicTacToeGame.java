package independentWork.advertMobile.ticTacToe;

import independentWork.advertMobile.ticTacToe.gameLogic.WinnerChecker;
import independentWork.advertMobile.ticTacToe.history.LogLoader;
import independentWork.advertMobile.ticTacToe.properties.ConsoleWriter;

import java.util.Scanner;

public class TicTacToeGame {
    private static final int SIZE = 3;

    public static int getSIZE() {
        return SIZE;
    }

    public void mainMenu() {
        boolean isRunning = true;
        while (isRunning) {
            ConsoleWriter.printOut(ConsoleWriter.MAIN_MENU);
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    startGame();
                    break;
                case "2":
                    new LogLoader().loadHistoryInMemory();
                    break;
                case "3":
                    ConsoleWriter.printOut(ConsoleWriter.QUIT_MESSAGE);
                    scanner.close();
                    isRunning = false;
                    break;
                default:
                    ConsoleWriter.printOut(ConsoleWriter.INCORRECT_PARAMS_MESSAGE);
            }
        }
    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            ConsoleWriter.printOut(ConsoleWriter.CONTINUE_QUESTION);
            input = scanner.next();
            if (input.equalsIgnoreCase(ConsoleWriter.YES)) {
                System.out.println();
                new TicTacToeGame().mainMenu();
            } else if (input.equalsIgnoreCase(ConsoleWriter.NO)) {
                ConsoleWriter.printOut(ConsoleWriter.GAME_OVER);
                break;
            }
        } while (input.equalsIgnoreCase(ConsoleWriter.NO) || input.equalsIgnoreCase(ConsoleWriter.YES));
    }

    private static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] field = new String[SIZE][SIZE];
        int playerIndex = 2;
        int quitIndex = 0;
        String player1;
        String player2;
        String cellPattern = ConsoleWriter.EMPTY_CELL;
        createField(field, cellPattern);
        showField(field);
        ConsoleWriter.printOut(ConsoleWriter.PL1_WELCOME_MESSAGE);
        player1 = scanner.nextLine();
        ConsoleWriter.printOut(ConsoleWriter.PL2_WELCOME_MESSAGE);
        player2 = scanner.nextLine();
        while ((playerIndex < 11) && (quitIndex == 0)) {
            if (playerIndex % 2 == 0) {
                System.out.println("\n" + player1 + ConsoleWriter.PUT_X);
            } else {
                System.out.println("\n" + player2 + ConsoleWriter.PUT_O);
            }
            ConsoleWriter.printOut(ConsoleWriter.INPUT_CELL_NUMBER);
            switch (scanner.next()) {
                case "1": {
                    if (field[0][0].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[0][0] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[0][0] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "2": {
                    if (field[0][1].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[0][1] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[0][1] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "3": {
                    if (field[0][2].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[0][2] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[0][2] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "4": {
                    if (field[1][0].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[1][0] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[1][0] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "5": {
                    if (field[1][1].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[1][1] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[1][1] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "6": {
                    if (field[1][2].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[1][2] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[1][2] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "7": {
                    if (field[2][0].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[2][0] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[2][0] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "8": {
                    if (field[2][1].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[2][1] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[2][1] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                case "9": {
                    if (field[2][2].equalsIgnoreCase(cellPattern)) {
                        if (playerIndex % 2 == 0) {
                            field[2][2] = ConsoleWriter.X;
                            playerIndex++;
                            break;
                        } else {
                            field[2][2] = ConsoleWriter.O;
                            playerIndex++;
                            break;
                        }
                    } else {
                        ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT_CELL_NOT_EMPTY);
                        break;
                    }
                }
                default:
                    ConsoleWriter.printOut(ConsoleWriter.ERROR_INPUT);
                    break;
            }
            showField(field);
            quitIndex = new WinnerChecker(field, quitIndex, player1, player2).checkWinner();
        }
        System.out.println();
        scanner.close();
    }

    private static void createField(String[][] field, String cellPattern) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = (cellPattern);
            }
        }
    }

    private static void showField(String[][] field) {
        ConsoleWriter.printOut(ConsoleWriter.CURRENT_FIELD_STATEMENT);
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
}
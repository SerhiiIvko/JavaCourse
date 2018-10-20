package independentWork.advertMobile.zeroAndCruix;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class TicTacToeGame {
    private static final int SIZE = 3;

    private static void mainMenu() {
        System.out.println("Game menu:\n" +
                "1. Start new game\n" +
                "2. Show history\n" +
                "3. Exit");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        if (!Character.isDigit(userChoice)) {
            switch (userChoice) {
                case 1:
                    startGame();
                    break;
                case 2:
                    showHistory();
                    break;
                case 3:
                    System.out.println("You successfully quit from game");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Incorrect input");
            }
        } else {
            System.out.println("Input digits only!");
        }
    }

    private static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String point;
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
        while ((playerIndex < 11) & (quitIndex == 0)) {
            if (playerIndex % 2 == 0) {
                System.out.println("\n" + player1 + ", put X in the cell");
            } else {
                System.out.println("\n" + player2 + ", put O in the cell");
            }
            System.out.print("Input number of the cell:> ");
            String errorMessage = "This cell is not empty, try enother value.";
            switch (point = scanner.next()) {
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
            quitIndex = checkGameSteps(field, quitIndex, player1, player2);
        }
        System.out.println();
    }

    private static int checkGameSteps(String[][] field, int quit, String player1, String player2) {
        String resultField = "";
        for (int t = 0; t < SIZE; t++) {
            if (((field[t][0]).equalsIgnoreCase(" [O] ")
                    & (field[t][1]).equalsIgnoreCase(" [O] ")
                    & field[t][2].equalsIgnoreCase(" [O] ")) ||
                    ((field[0][t]).equalsIgnoreCase(" [O] ")
                            & (field[1][t]).equalsIgnoreCase(" [O] ")
                            & field[2][t].equalsIgnoreCase(" [O] "))) {
                System.out.println("\nWin " + player2);
                resultField = resultField.concat(field[0][0] + field[0][1] + field[0][2] + "\n"
                        + field[1][0] + field[1][1] + field[1][2] + "\n"
                        + field[2][0] + field[2][1] + field[2][2]).concat("\nWinner: " + player2 + "\n" + new Date().toString() + "\n");
                quit++;
                exit();
            } else if (((field[t][0]).equalsIgnoreCase(" [X] ")
                    & (field[t][1]).equalsIgnoreCase(" [X] ")
                    & field[t][2].equalsIgnoreCase(" [X] ")) ||
                    ((field[0][t]).equalsIgnoreCase(" [X] ")
                            & (field[1][t]).equalsIgnoreCase(" [X] ")
                            & field[2][t].equalsIgnoreCase(" [X] "))) {
                System.out.println("\nWin " + player1);
                resultField = resultField.concat(field[0][0] + field[0][1] + field[0][2] + "\n"
                        + field[1][0] + field[1][1] + field[1][2] + "\n"
                        + field[2][0] + field[2][1] + field[2][2]).concat("\nWinner: " + player1);
                quit++;
                exit();
            }
        }
        if (((field[0][0]).equalsIgnoreCase(" [X] ")
                & (field[1][1]).equalsIgnoreCase(" [X] ")
                & field[2][2].equalsIgnoreCase(" [X] ")) ||
                ((field[0][2]).equalsIgnoreCase(" [X] ")
                        & (field[1][1]).equalsIgnoreCase(" [X] ")
                        & field[2][0].equalsIgnoreCase(" [X] "))) {
            System.out.println("\nWin " + player1);
            quit++;
            exit();
        } else if (((field[0][0]).equalsIgnoreCase(" [O] ")
                & (field[1][1]).equalsIgnoreCase(" [O] ")
                & field[2][2].equalsIgnoreCase(" [O] ")) ||
                ((field[0][2]).equalsIgnoreCase(" [O] ")
                        & (field[1][1]).equalsIgnoreCase(" [O] ")
                        & field[2][0].equalsIgnoreCase(" [O] "))) {
            System.out.println("\nWin " + player2);
            quit++;
            exit();
        }
//        Date date = new Date();
        try {
            saveLogOfGames(resultField);
        } catch (IOException e) {
            e.getMessage();
        }
        return quit;
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

    private static void saveLogOfGames(String resultField) throws IOException {
        String path = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt";
        File file = new File(path);

        FileWriter fooWriter = new FileWriter(file, true);
        fooWriter.write(resultField);
        fooWriter.close();
    }

    private static void exit() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Do you want to continue? ");
            input = scanner.next();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("New game");
                startGame();
            } else if (input.equalsIgnoreCase("N")) {
                System.out.println("Game over");
                break;
            }
        } while (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("Y"));
    }

    private static void showHistory(){
        String history = null;
        try {
            history = new String(Files.readAllBytes
                    (Paths.get("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(history);
    }

    public static void main(String[] args) {
//        startGame();
        mainMenu();
    }
}
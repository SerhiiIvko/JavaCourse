package independentWork.advertMobile.ticTacToe.gameLogic;

import independentWork.advertMobile.ticTacToe.TicTacToeGame;
import independentWork.advertMobile.ticTacToe.history.LogLoader;
import independentWork.advertMobile.ticTacToe.properties.ConsoleWriter;

import java.util.Date;

public class WinnerChecker {
    private String[][] field;
    private int quit;
    private String player1;
    private String player2;

    public WinnerChecker(String[][] field, int quit, String player1, String player2) {
        this.field = field;
        this.quit = quit;
        this.player1 = player1;
        this.player2 = player2;
    }

    public int checkWinner() {
        LogLoader logLoader = new LogLoader();
        String resultField = "";
        String showWinner1 = "\nWin " + player1;
        String showWinner2 = "\nWin " + player2;
        String winner = resultField.concat(field[0][0] + field[0][1] + field[0][2] + "\n"
                + field[1][0] + field[1][1] + field[1][2] + "\n" + field[2][0] + field[2][1] + field[2][2])
                .concat("\nWinner: " + player1 + "\n" + new Date().toString() + "\n");
        for (int t = 0; t < TicTacToeGame.getSIZE(); t++) {
            if (((field[t][0]).equalsIgnoreCase(ConsoleWriter.O)
                    & (field[t][1]).equalsIgnoreCase(ConsoleWriter.O)
                    & field[t][2].equalsIgnoreCase(ConsoleWriter.O)) ||
                    ((field[0][t]).equalsIgnoreCase(ConsoleWriter.O)
                            & (field[1][t]).equalsIgnoreCase(ConsoleWriter.O)
                            & field[2][t].equalsIgnoreCase(ConsoleWriter.O))) {
                resultField = winner;
                logLoader.saveHistory(resultField);
                quit++;
                System.out.println(showWinner2);
                TicTacToeGame.exit();
            } else if (((field[t][0]).equalsIgnoreCase(ConsoleWriter.X)
                    & (field[t][1]).equalsIgnoreCase(ConsoleWriter.X)
                    & field[t][2].equalsIgnoreCase(ConsoleWriter.X)) ||
                    ((field[0][t]).equalsIgnoreCase(ConsoleWriter.X)
                            & (field[1][t]).equalsIgnoreCase(ConsoleWriter.X)
                            & field[2][t].equalsIgnoreCase(ConsoleWriter.X))) {
                resultField = winner;
                logLoader.saveHistory(resultField);
                quit++;
                System.out.println(showWinner1);
                TicTacToeGame.exit();
            }
        }
        if (((field[0][0]).equalsIgnoreCase(ConsoleWriter.X)
                & (field[1][1]).equalsIgnoreCase(ConsoleWriter.X)
                & field[2][2].equalsIgnoreCase(ConsoleWriter.X)) ||
                ((field[0][2]).equalsIgnoreCase(ConsoleWriter.X)
                        & (field[1][1]).equalsIgnoreCase(ConsoleWriter.X)
                        & field[2][0].equalsIgnoreCase(ConsoleWriter.X))) {
            resultField = winner;
            logLoader.saveHistory(resultField);
            quit++;
            System.out.println(showWinner1);
            TicTacToeGame.exit();
        } else if (((field[0][0]).equalsIgnoreCase(ConsoleWriter.O)
                & (field[1][1]).equalsIgnoreCase(ConsoleWriter.O)
                & field[2][2].equalsIgnoreCase(ConsoleWriter.O)) ||
                ((field[0][2]).equalsIgnoreCase(ConsoleWriter.O)
                        & (field[1][1]).equalsIgnoreCase(ConsoleWriter.O)
                        & field[2][0].equalsIgnoreCase(ConsoleWriter.O))) {
            resultField = winner;
            logLoader.saveHistory(resultField);
            quit++;
            System.out.println(showWinner2);
            TicTacToeGame.exit();
        }
        return quit;
    }
}
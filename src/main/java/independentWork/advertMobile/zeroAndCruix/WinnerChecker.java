package independentWork.advertMobile.zeroAndCruix;

import java.io.IOException;
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

    public int checkWinner(){
        String resultField = "";
        for (int t = 0; t < TicTacToeGame.getSIZE(); t++) {
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
                TicTacToeGame.exit();
            } else if (((field[t][0]).equalsIgnoreCase(" [X] ")
                    & (field[t][1]).equalsIgnoreCase(" [X] ")
                    & field[t][2].equalsIgnoreCase(" [X] ")) ||
                    ((field[0][t]).equalsIgnoreCase(" [X] ")
                            & (field[1][t]).equalsIgnoreCase(" [X] ")
                            & field[2][t].equalsIgnoreCase(" [X] "))) {
                System.out.println("\nWin " + player1);
                resultField = resultField.concat(field[0][0] + field[0][1] + field[0][2] + "\n"
                        + field[1][0] + field[1][1] + field[1][2] + "\n"
                        + field[2][0] + field[2][1] + field[2][2]).concat("\nWinner: " + player1 + "\n" + new Date().toString() + "\n");
                quit++;
                TicTacToeGame.exit();
            }
        }
        if (((field[0][0]).equalsIgnoreCase(" [X] ")
                & (field[1][1]).equalsIgnoreCase(" [X] ")
                & field[2][2].equalsIgnoreCase(" [X] ")) ||
                ((field[0][2]).equalsIgnoreCase(" [X] ")
                        & (field[1][1]).equalsIgnoreCase(" [X] ")
                        & field[2][0].equalsIgnoreCase(" [X] "))) {
            System.out.println("\nWin " + player1 + "\n" + new Date().toString() + "\n");
            quit++;
            TicTacToeGame.exit();
        } else if (((field[0][0]).equalsIgnoreCase(" [O] ")
                & (field[1][1]).equalsIgnoreCase(" [O] ")
                & field[2][2].equalsIgnoreCase(" [O] ")) ||
                ((field[0][2]).equalsIgnoreCase(" [O] ")
                        & (field[1][1]).equalsIgnoreCase(" [O] ")
                        & field[2][0].equalsIgnoreCase(" [O] "))) {
            System.out.println("\nWin " + player2 + "\n" + new Date().toString() + "\n");
            quit++;
            TicTacToeGame.exit();
        }
        try {
//            saveLogOfGames(resultField);
            new LogSaver().saveHistory(resultField);
        } catch (IOException e) {
            e.getMessage();
        }
        return quit;
    }
}

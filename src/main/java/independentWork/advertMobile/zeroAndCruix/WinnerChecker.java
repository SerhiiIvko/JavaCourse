package independentWork.advertMobile.zeroAndCruix;

import java.util.Date;

class WinnerChecker {
    private String[][] field;
    private int quit;
    private String player1;
    private String player2;

    WinnerChecker(String[][] field, int quit, String player1, String player2) {
        this.field = field;
        this.quit = quit;
        this.player1 = player1;
        this.player2 = player2;
    }

    int checkWinner() {
        LogLoader logLoader = new LogLoader();
        String resultField = "";
        String showWinner1 = "\nWin " + player1;
        String showWinner2 = "\nWin " + player2;
        String winner = resultField.concat(field[0][0] + field[0][1] + field[0][2] + "\n"
                + field[1][0] + field[1][1] + field[1][2] + "\n" + field[2][0] + field[2][1] + field[2][2])
                .concat("\nWinner: " + player1 + "\n" + new Date().toString() + "\n");
        for (int t = 0; t < TicTacToeGame.getSIZE(); t++) {
            if (((field[t][0]).equalsIgnoreCase(" [O] ")
                    & (field[t][1]).equalsIgnoreCase(" [O] ")
                    & field[t][2].equalsIgnoreCase(" [O] ")) ||
                    ((field[0][t]).equalsIgnoreCase(" [O] ")
                            & (field[1][t]).equalsIgnoreCase(" [O] ")
                            & field[2][t].equalsIgnoreCase(" [O] "))) {
                resultField = winner;
                logLoader.saveHistory(resultField);
                quit++;
                System.out.println(showWinner2);
                TicTacToeGame.exit();
            } else if (((field[t][0]).equalsIgnoreCase(" [X] ")
                    & (field[t][1]).equalsIgnoreCase(" [X] ")
                    & field[t][2].equalsIgnoreCase(" [X] ")) ||
                    ((field[0][t]).equalsIgnoreCase(" [X] ")
                            & (field[1][t]).equalsIgnoreCase(" [X] ")
                            & field[2][t].equalsIgnoreCase(" [X] "))) {
                resultField = winner;
                logLoader.saveHistory(resultField);
                quit++;
                System.out.println(showWinner1);
                TicTacToeGame.exit();
            }
        }
        if (((field[0][0]).equalsIgnoreCase(" [X] ")
                & (field[1][1]).equalsIgnoreCase(" [X] ")
                & field[2][2].equalsIgnoreCase(" [X] ")) ||
                ((field[0][2]).equalsIgnoreCase(" [X] ")
                        & (field[1][1]).equalsIgnoreCase(" [X] ")
                        & field[2][0].equalsIgnoreCase(" [X] "))) {
            resultField = winner;
            logLoader.saveHistory(resultField);
            quit++;
            System.out.println(showWinner1);
            TicTacToeGame.exit();
        } else if (((field[0][0]).equalsIgnoreCase(" [O] ")
                & (field[1][1]).equalsIgnoreCase(" [O] ")
                & field[2][2].equalsIgnoreCase(" [O] ")) ||
                ((field[0][2]).equalsIgnoreCase(" [O] ")
                        & (field[1][1]).equalsIgnoreCase(" [O] ")
                        & field[2][0].equalsIgnoreCase(" [O] "))) {
            resultField = winner;
            logLoader.saveHistory(resultField);
            quit++;
            System.out.println(showWinner2);
            TicTacToeGame.exit();
        }
        return quit;
    }
}
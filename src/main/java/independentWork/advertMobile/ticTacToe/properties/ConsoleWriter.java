package independentWork.advertMobile.ticTacToe.properties;

public class ConsoleWriter {
    public static final String X = " [X] ";
    public static final String O = " [O] ";

    public static final String PLAY_FIRST_GAME = "You must play one game at least! Your history is empty yet!\n";
    public static final String MAIN_MENU = "Game menu:\n" +
            "1. Start new game\n" +
            "2. Show history\n" +
            "3. Exit";
    public static final String QUIT_MESSAGE = "You successfully quit from game";
    public static final String INCORRECT_PARAMS_MESSAGE = "Incorrect input";
    public static final String EMPTY_CELL = " [ ] ";
    public static final String PL1_WELCOME_MESSAGE = "Player 1, input your name, please: \n";
    public static final String PL2_WELCOME_MESSAGE = "Player 2, input your name, please: \n";
    public static final String PUT_X = ", put X in the cell";
    public static final String PUT_O = ", put O in the cell";
    public static final String INPUT_CELL_NUMBER = "Input number of the cell:> ";
    public static final String ERROR_INPUT_CELL_NOT_EMPTY = "This cell is not empty, try again.";
    public static final String ERROR_INPUT = "\nInput error, try again!";
    public static final String CURRENT_FIELD_STATEMENT = "Current field statement";
    public static final String CONTINUE_QUESTION = "Do you want to continue? ";
    public static final String YES = "Y";
    public static final String NO = "N";
    public static final String GAME_OVER = "Game over";
    //    public static final String
//    public static final String
//    public static final String
//    public static final String
//    public static final String

    public static void printOut(String message) {
        System.out.println(message);
    }
}
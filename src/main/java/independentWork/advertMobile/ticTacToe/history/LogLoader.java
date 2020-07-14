package independentWork.advertMobile.ticTacToe.history;

import independentWork.advertMobile.ticTacToe.properties.AppProperties;
import independentWork.advertMobile.ticTacToe.properties.ConsoleWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LogLoader {

    public void loadHistoryInMemory() {
        LogLoader logLoader = new LogLoader();
        String gameResult = logLoader.showHistory();
        if (gameResult != null && !gameResult.trim().isEmpty()) {
            System.out.println(logLoader.showHistory());
        } else {
            ConsoleWriter.printOut(ConsoleWriter.PLAY_FIRST_GAME);
        }
    }

    public void saveHistory(String resultField) {
        try {
            String path = AppProperties.HISTORY_FILE_PATH;
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(resultField);
            fileWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private String showHistory() {
        String gameLog = null;
        try {
            gameLog = new String(Files.readAllBytes
                    (Paths.get(AppProperties.HISTORY_FILE_PATH)),
                    StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return gameLog;
    }
}
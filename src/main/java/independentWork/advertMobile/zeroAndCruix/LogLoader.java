package independentWork.advertMobile.zeroAndCruix;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class LogLoader {

    void loadHistoryInMemory() {
        LogLoader logLoader = new LogLoader();
        String gameResult = logLoader.showHistory();
        if (gameResult != null && !gameResult.trim().isEmpty()) {
            System.out.println(logLoader.showHistory());
        } else {
            System.out.println("You must play one game at least! Your history is empty yet!\n");
        }
    }

    void saveHistory(String resultField) throws IOException {
        String path = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt";
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(resultField);
        fileWriter.close();
    }

    private String showHistory() {
        String gameLog = null;
        try {
            gameLog = new String(Files.readAllBytes
                    (Paths.get("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt")),
                    StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return gameLog;
    }
}
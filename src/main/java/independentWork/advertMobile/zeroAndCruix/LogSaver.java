package independentWork.advertMobile.zeroAndCruix;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LogSaver {
    String resultField;

    public void saveHistory(String resultField) throws IOException {
        String path = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt";
        File file = new File(path);

        FileWriter fooWriter = new FileWriter(file, true);
        fooWriter.write(resultField);
        fooWriter.close();
    }


    public void showHistory(){
        String history = null;
        try {
            history = new String(Files.readAllBytes
                    (Paths.get("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(history);
    }
}

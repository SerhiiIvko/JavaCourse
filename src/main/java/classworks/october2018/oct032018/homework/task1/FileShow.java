package classworks.october2018.oct032018.homework.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileShow {
    private static void showFilesInDirectory(String directoryPath) {
        File file = new File(directoryPath);
        List<String> files = new ArrayList<>(Arrays.asList(file.list()));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < files.size(); i++) {
            String fileName = files.get(i);
            builder = builder.append(fileName).append("\n");
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) throws IOException {
        showFilesInDirectory("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list");
        saveFileAs("get one.txt /home/ivko/IdeaProjects/JavaCourse/src/main/resources/ one1.txt");

    }

    private static void saveFileAs(String arguments) throws IOException {
        System.out.println("Copy file");
        String[] copyCommand = arguments.split(" ");
        String fileName = copyCommand[1];
        String placeToSave = copyCommand[2];
        String newFileName = copyCommand[3];
        File file = new File("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list/" + fileName);
        if (file.exists()) {
            Files.copy(file.toPath(), (new File(placeToSave + newFileName)).toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
        } else {
            throw new FileNotFoundException("File not found!");
        }
    }
}
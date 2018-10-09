package classworks.october2018.oct032018.homework.task1;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleClientHandler extends Thread {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;
    private final Socket socket;
    private static final String LIST_COMMAND = "list";
    private static final String GET_COMMAND = "get";
    private static final String EXIT_COMMAND = "exit";

    ConsoleClientHandler(Socket socket, DataInputStream inputStream, DataOutputStream outputStream) {
        this.socket = socket;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    private static String showFilesInDirectory(String directoryPath) {
        File file = new File(directoryPath);
        if (!file.isDirectory()) {
            System.out.println("Input path to directory");
        } else {
            List<String> files = new ArrayList<>(Arrays.asList(file.list()));
            StringBuilder builder = new StringBuilder();
            for (String fileName : files) builder = builder.append(fileName).append("\n");
            return builder.toString();
        }
        return new IllegalArgumentException().getMessage();
    }

    private static String saveFileAs(String arguments) throws IOException {
        System.out.println("Copy file");
        String[] copyCommand = arguments.split(" ");
        if (copyCommand.length < 2 || copyCommand.length > 3) {
            System.out.println("Incorrect arguments for operation");
        }
        String fileName = copyCommand[1];
        String placeToSave = copyCommand[2];
        String newFileName = copyCommand[3];
        String messageForReturn;
        File file = new File("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list/" + fileName);
        if (file.exists() && !file.isDirectory()) {
            Files.copy(file.toPath(), (new File(placeToSave + newFileName)).toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
            messageForReturn = "File was saved successfully";
        } else {
            messageForReturn = "Failed to save the file";
        }
        return messageForReturn;
    }

    @Override
    public void run() {
        String receivedMessage;
        String messageForReturn;
        while (true) {
            try {
                outputStream.writeUTF("What do you want?\n"
                        + "[List files - command List | Save file - command Get with file name, path for saving, final file name].\n"
                        + "Type Exit to terminate connection.");
                receivedMessage = inputStream.readUTF();
                if (receivedMessage.equalsIgnoreCase(EXIT_COMMAND)) {
                    System.out.println("Client " + this.socket + " sends exit...");
                    System.out.println("Closing this connection.");
                    this.socket.close();
                    System.out.println("Connection closed");
                    break;
                }
                if (receivedMessage.equalsIgnoreCase(LIST_COMMAND)) {
                    messageForReturn = showFilesInDirectory("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list");
                    outputStream.writeUTF(messageForReturn);
                } else if (receivedMessage.startsWith(GET_COMMAND)) {
                    messageForReturn = saveFileAs(receivedMessage);
                    outputStream.writeUTF(messageForReturn);
                } else {
                    outputStream.writeUTF("Invalid input");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.inputStream.close();
            this.outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
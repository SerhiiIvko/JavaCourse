package classworks.october2018.oct032018.homework.task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ConsoleClientHandler extends Thread {
    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;
    private final Socket socket;
    private static final int BUFFER_SIZE = 4096;
    private static final String LIST_COMMAND = "list";
    private static final String GET_COMMAND = "get";
    private static final String EXIT_COMMAND = "exit";

    // Constructor
    public ConsoleClientHandler(Socket socket, DataInputStream inputStream, DataOutputStream outputStream) {
        this.socket = socket;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

    public static void showFilesInDirectory(String directoryPath) {
        File file = new File(directoryPath);
        ArrayList<String> files = new ArrayList<>(Arrays.asList(file.list()));
        StringBuilder builder = new StringBuilder();
        for (String file1 : files) builder = builder.append(file1).append("\n");
        System.out.println(builder);
    }

    @Override
    public void run() {
        String receivedMessage;
        String messageForReturn;
        while (true) {
            try {
                // Ask user what he wants
                outputStream.writeUTF("What do you want?[List files - command List | Save file - command Get]..\n" + "Type Exit to terminate connection.");
                // receive the answer from client
                receivedMessage = inputStream.readUTF();
                if (receivedMessage.equals("Exit")) {
                    System.out.println("Client " + this.socket + " sends exit...");
                    System.out.println("Closing this connection.");
                    this.socket.close();
                    System.out.println("Connection closed");
                    break;
                }
                // creating Date object
                Date date = new Date();
                // write on output stream based on the answer from the client
                switch (receivedMessage) {
                    case "List":
                        showFilesInDirectory("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list");
//                        messageForReturn = fordate.format(date);
//                        outputStream.writeUTF(messageForReturn);
                        break;
                    case "Get":
                        messageForReturn = fortime.format(date);
                        outputStream.writeUTF(messageForReturn);
                        break;
                    default:
                        outputStream.writeUTF("Invalid input");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            // closing resources
            this.inputStream.close();
            this.outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
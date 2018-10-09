package classworks.october2018.oct032018.classwork.ex4.task;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Server {
    private static final int PORT = 3456;
    private static final String HELP_COMMAND = "help";
    private static final String STOP_COMMAND = "stop";
    private static final String LIST_COMMAND = "list";
    private static final String GET_COMMAND = "get";

    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            byte[] sentData;
            DatagramPacket packet;
            while (true) {
                int bufferSize = 256;
                sentData = new byte[bufferSize];
                packet = new DatagramPacket(sentData, sentData.length);
                System.out.println("Waiting...");
                socket.receive(packet);
                byte[] receiveData = packet.getData();
                String command = new String(receiveData).trim();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();

                if (command.equalsIgnoreCase(HELP_COMMAND)) {
                    String serverRunned = "server runned";
                    sentData = serverRunned.getBytes();
                } else if (command.equalsIgnoreCase(STOP_COMMAND)) {
                    String serverStopped = "server stoped";
                    sentData = serverStopped.getBytes();
                } else if (command.equalsIgnoreCase(LIST_COMMAND)) {
                    sentData = getFileList();
                } else if (command.startsWith(GET_COMMAND)) {
                    sentData = getFile(command);
                } else {
                    String errorMessage = "It's not command!";
                    sentData = errorMessage.getBytes();
                }
                packet = new DatagramPacket(sentData, sentData.length, address, port);
                socket.send(packet);
                if (command.equalsIgnoreCase(STOP_COMMAND)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] getFileList() {
        String directoryPath = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list";
        File file = new File(directoryPath);
        List<String> files = new ArrayList<>(Arrays.asList(Objects.requireNonNull(file.list())));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < files.size(); i++) {
            String file1 = files.get(i);
            builder = builder.append(file1).append("\n");
        }
//        System.out.println(builder);
//        return  builder.toString();

//        File[] list = new File("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list").listFiles();
//        StringBuilder builder = new StringBuilder();
//        if (list != null) {
//            int bound = list.length;
//            for (int i = 0; i < bound; i++) {
//                if (list[i].isFile()) {
//                    if (builder.length() != 0) {
//                        builder.append("\n");
//                    }
//                    builder.append(list[i].getName()).append(" ").append(list[i].length());
//                }
//            }
//        }
        return builder.toString().getBytes();
    }

//    private static String getFileList(){
//        String directoryPath = "";
//        File file = new File(directoryPath);
//        ArrayList<String> files = new ArrayList<>(Arrays.asList(file.list()));
//        StringBuilder builder = new StringBuilder();
//        for (String file1 : files) builder = builder.append(file1).append("\n");
////        System.out.println(builder);
//        return  builder.toString();
//    }

    private static byte[] getFile(String command) {
        String[] split = command.split(" ");
        File file = new File("/home/ivko/IdeaProjects/JavaCourse/src/main/resources/" + split[1]);
        try {
            String prefix = "File: ";
            int prefixLength = prefix.length();
            int buffer = (int) file.length() + prefixLength;
            byte[] response = new byte[buffer];
            addPrefix(prefix, response);
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
                inputStream.read(response, prefixLength, buffer - prefixLength);
            }
            return response;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            String errorMessage = "File not exists";
            return errorMessage.getBytes();
        } catch (IOException e) {
            return ("read error - " + e.getMessage()).getBytes();
        }

    }

    private static void addPrefix(String prefix, byte[] response) {
        byte[] commandArray = prefix.getBytes();
        IntStream.range(0, prefix.length()).forEach(i -> response[i] = commandArray[i]);
    }
}
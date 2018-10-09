package classworks.october2018.oct032018.classwork.ex4.task;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class Client {
    private static final int PORT = 3456;
    private static final String EXIT_COMMAND = "exit";
    private static final String FILE_COMMAND = "file";
    private static final String GET_COMMAND = "get";

    public static void main(String[] args) throws IOException {
        try (DatagramSocket datagramSocket = new DatagramSocket()) {
            InetAddress address = InetAddress.getByName("localhost");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            DatagramPacket packet;
            byte[] data;
            while (true) {
                System.out.println("\n>");
                String command = bufferedReader.readLine();
                int bufferSize = 256;
                if (command.equalsIgnoreCase(EXIT_COMMAND)) {
                    break;
                }
                data = command.getBytes();
                packet = new DatagramPacket(data, data.length, address, PORT);
                datagramSocket.send(packet);
                if (command.startsWith(GET_COMMAND + " ")) {
                    String[] split = command.split(" ");
                    bufferSize = Integer.parseInt(split[2]) + 5;
                    System.out.println("buffer size = " + bufferSize);
                }
                data = new byte[bufferSize];
                packet = new DatagramPacket(data, data.length);
                datagramSocket.receive(packet);
                byte[] receiveData = packet.getData();
                String type = new String(receiveData, 0, 5);
                if (type.equalsIgnoreCase(FILE_COMMAND)) {
                    saveFileFromByteArray("three.txt", receiveData);
                    System.out.println("File saved");
                } else {
                    System.out.println(new String(receiveData));
                }
            }
        }
    }

    private static void saveFileFromByteArray(String fileName, byte[] receiveData) throws IOException {
        File file = new File("/home/ivko/IdeaProjects/JavaCourse/src/main/resources" + fileName);
        byte[] fileContent = Arrays.copyOfRange(receiveData, 5, receiveData.length);
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            outputStream.write(fileContent, 0, fileContent.length);
        }
    }
}
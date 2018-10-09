package classworks.october2018.oct032018.homework.task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConsoleClient {
    private static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            InetAddress inetAddress = InetAddress.getByName("localhost");
            Socket socket = new Socket(inetAddress, 9191);
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            while (true) {
                System.out.println(inputStream.readUTF());
                String messageForSending = scanner.nextLine();
                outputStream.writeUTF(messageForSending);
                if (messageForSending.equalsIgnoreCase(EXIT_COMMAND)) {
                    System.out.println("Closing this connection : " + socket);
                    socket.close();
                    System.out.println("Connection closed");
                    break;
                }
                String received = inputStream.readUTF();
                System.out.println(received);
            }
            scanner.close();
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
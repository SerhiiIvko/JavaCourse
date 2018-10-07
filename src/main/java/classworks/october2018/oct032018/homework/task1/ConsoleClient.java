package classworks.october2018.oct032018.homework.task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConsoleClient {
    private static String EXIT_COMMAND = "Exit";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // getting localhost ip
            InetAddress inetAddress = InetAddress.getByName("localhost");
            // establish the connection with server port 5056
            Socket socket = new Socket(inetAddress, 9191);
            // obtaining input and out streams
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            // the following loop performs the exchange of
            // information between client and client handler
            while (true) {
                System.out.println(inputStream.readUTF());
                String messageForSending = scanner.nextLine();
                outputStream.writeUTF(messageForSending);
                // If client sends exit,close this connection
                // and then break from the while loop
                if (messageForSending.equalsIgnoreCase(EXIT_COMMAND)) {
                    System.out.println("Closing this connection : " + socket);
                    socket.close();
                    System.out.println("Connection closed");
                    break;
                }
                // printing date or time as requested by client
                String received = inputStream.readUTF();
                System.out.println(received);
            }
            // closing resources
            scanner.close();
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
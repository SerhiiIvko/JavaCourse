package classworks.october2018.oct032018.homework.task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9191);
        System.out.println("Server started...");
        while (true) {
            Socket socket = null;
            try {
                socket = serverSocket.accept();
                System.out.println("A new client is connected : " + socket);
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                System.out.println("Assigning new thread for this client");
                Thread t = new ConsoleClientHandler(socket, inputStream, outputStream);
                t.start();
            } catch (Exception e) {
                if (socket != null) {
                    socket.close();
                }
                e.printStackTrace();
            }
        }
    }
}
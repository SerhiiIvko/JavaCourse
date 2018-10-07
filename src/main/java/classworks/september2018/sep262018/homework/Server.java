package classworks.september2018.sep262018.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    private static final int port = 6666;
    private static final String SENT_ME_MESSAGE = "Клиент '%d' отправил сообщение на сервер: \n\t";
    private static final String CLOSED_THE_CONNECTION = "Клиент '%d' завершил соединение";
    private Socket socket;
    private int num;
    private String line;

    public Server() {
    }

    public void setSocket(int num, Socket socket) {
        this.num = num;
        this.socket = socket;
        setDaemon(true);
        setPriority(NORM_PRIORITY);
        start();
    }

    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            while (true) {
                line = dataInputStream.readUTF();
                System.out.println(String.format(SENT_ME_MESSAGE, num) + line);
                System.out.println("Отправляется обратно...");
                dataOutputStream.writeUTF("На сервер пришло сообщение: " + line);
                dataOutputStream.flush();
                System.out.println();
                if (line.equalsIgnoreCase("quit")) {
                    socket.close();
                    System.out.println(String.format(CLOSED_THE_CONNECTION, num));
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getCause());
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            int connectionCounter = 0;
            InetAddress inetAddress = InetAddress.getByName("localhost");
            serverSocket = new ServerSocket(port, 0, inetAddress);
            System.out.println("Сервер запущен\n\n");
            while (true) {
                Socket socket = serverSocket.accept();
                System.err.println("Клиент подключился к серверу");
                new Server().setSocket(connectionCounter++, socket);
            }
        } finally {
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
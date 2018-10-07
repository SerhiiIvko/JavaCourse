package classworks.september2018.sep262018.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private static final int serverPort = 6666;
    private static final String localhost = "127.0.0.1";
    private static String line;

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            System.out.println("Добро пожаловать на сторону Клиента\n" + "Подключение к серверу\n\t"
                    + "(IP address " + localhost + ", port " + serverPort + ")");
            InetAddress inetAddress = InetAddress.getByName(localhost);
            socket = new Socket(inetAddress, serverPort);
            System.out.println("Соединение установлено:");
            System.out.println("\tLocalPort = " + socket.getLocalPort() +
                    "\n\tInetAddress.HostAddress = " + socket.getInetAddress().getHostAddress() +
                    "\n\tReceiveBufferSize = " + socket.getReceiveBufferSize());
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader keyboardDataReader = new BufferedReader(inputStreamReader);
            System.out.println("Напишите что-то и нажмите enter");
            System.out.println();
            while (true) {
                line = keyboardDataReader.readLine();
                dataOutputStream.writeUTF(line);
                dataOutputStream.flush();
                line = dataInputStream.readUTF();
                if (line.endsWith("quit")) {
                    System.out.println("Клиент отключился от сервера");
                    break;
                } else {
                    System.out.println("Сервер отправил сообщение клиенту:\n\t" + line);
                }
            }
        } finally {
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
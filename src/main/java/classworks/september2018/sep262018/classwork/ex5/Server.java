package classworks.september2018.sep262018.classwork.ex5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    private ServerSocket serverSocket; // Определяется переменная serverSocket

    public Server() {
        try {
            /*
             * Создание объекта ServerSocket, который принимает запросы
             * соединения от клиентов от порта 1001
             */
            serverSocket = new ServerSocket(1001);
            System.out.println(serverSocket.toString());
        } catch (IOException e) {
            fail(e, "Could not start server.");
        }
        System.out.println("Server is running . . .");
        /* Стартует поток */
        this.start();
    }

    public static void fail(Exception e, String str) {
        System.out.println(str + "." + e);
    }

    public void run() {
        try {
            while (true) {
                /* Принимаются запросы от клиентов */
                Socket client = serverSocket.accept();
                /*
                 * Создается объект соединение, чтобы управлять взаимодействием
                 * кдиента с сервером
                 */
                ConnectionClass con = new ConnectionClass(client);
            }
        } catch (IOException e) {
            fail(e, "Not listening");
        }
    }

    public static void main(String args[]) {
        /* Запускается сервер */
        new Server();
    }
}
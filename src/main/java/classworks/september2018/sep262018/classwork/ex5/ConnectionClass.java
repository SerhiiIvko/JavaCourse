package classworks.september2018.sep262018.classwork.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ConnectionClass extends Thread {
    /* Declare the variables */
    protected Socket netClient;
    protected BufferedReader fromClient;
    protected PrintStream toClient;

    public ConnectionClass(Socket client) {
        netClient = client;
        try {
            /* Создается входной поток, чтобы принимать данные от клиента */
            fromClient = new BufferedReader(new InputStreamReader(
                    netClient.getInputStream()));
            /* Создается выходной поток, чтобы посылать данные клиенту */
            toClient = new PrintStream(netClient.getOutputStream());
        } catch (IOException e) {
            try {
                /* Закрывается сокет клиента */
                netClient.close();
            } catch (IOException e1) {
                System.err.println("Unable to set up streams" + e1);
                return;
            }
        }
        /* Start the thread */
        this.start();
    }

    public void run() {
        String login, password;
        try {
            while (true) {
                toClient.println("Login: ");
                /* Принимается login как ввод от клиента */
                login = fromClient.readLine();
                /* Завершить соединение, когда Bye вводится как login */
                if (login == null || login.equals("Bye")) {
                    System.out.println("Exit");
                    return;
                } else
                    System.out.println(login + " logged in");
                // Посылается подтверждение клиенту
                toClient.println("Password: ");
                /* Принимается пароль то клиента */
                password = fromClient.readLine();
            }
        } catch (IOException ignored) {
        } finally {
            try {
                netClient.close();
            } catch (IOException ignored) {
            }
        }
    }
}
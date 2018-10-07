package classworks.september2018.sep262018.classwork.ex7;

import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5566);
            while (true) {
                Socket client = server.accept();
                EchoHandler handler = new EchoHandler(client);
                handler.start();
            }
        } catch (Exception e) {
            System.err.println("Exception caught:" + e);
        }
    }
}
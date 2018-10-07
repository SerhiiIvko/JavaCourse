package classworks.september2018.sep262018.classwork.ex7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class EchoHandler extends Thread {
    Socket client;

    EchoHandler(Socket client) {
        this.client = client;
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            writer.println("[type 'bye' to disconnect]");

            while (true) {
                String line = reader.readLine();
                if (line.trim().equals("bye")) {
                    writer.println("bye!");
                    break;
                }
                writer.println("[echo] " + line);
            }
        } catch (Exception e) {
            System.err.println("Exception caught: client disconnected.");
        } finally {
            try {
                client.close();
            } catch (Exception ignored) {
            }
        }
    }
}
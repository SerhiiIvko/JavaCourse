package classworks.september2018.sep262018.classwork.ex8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {


    public static void main(String[] args) throws IOException {

        int portNumber = 9987;

        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));

        ) {
            Thread thread = new Thread(new ClientWorker(clientSocket));
            thread.start(); //start thread

            String inputLine, outputLine;

            // Initiate conversation with client
            Protocol prot = new Protocol();
            outputLine = prot.processInput(null);
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) {
                outputLine = prot.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("quit"))
                    break;
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
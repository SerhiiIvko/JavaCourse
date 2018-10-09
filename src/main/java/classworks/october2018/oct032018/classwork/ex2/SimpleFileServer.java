package classworks.october2018.oct032018.classwork.ex2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleFileServer {
    public final static int SOCKET_PORT = 13267;  // you may change this
    public final static String FILE_TO_SEND = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list/two.txt";  // you may change this

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream = null;
        OutputStream outputStream = null;
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(SOCKET_PORT)) {
            while (true) {
                System.out.println("Waiting...");
                try {
                    socket = serverSocket.accept();
                    System.out.println("Accepted connection : " + socket);
                    // send file
                    File myFile = new File(FILE_TO_SEND);
                    byte[] mybytearray = new byte[(int) myFile.length()];
                    fileInputStream = new FileInputStream(myFile);
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    bufferedInputStream.read(mybytearray, 0, mybytearray.length);
                    outputStream = socket.getOutputStream();
                    System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
                    outputStream.write(mybytearray, 0, mybytearray.length);
                    outputStream.flush();
                    System.out.println("Done.");
                } finally {
                    if (bufferedInputStream != null) bufferedInputStream.close();
                    if (outputStream != null) outputStream.close();
                    if (socket != null) socket.close();
                }
            }
        }
    }
}
package classworks.october2018.oct032018.classwork.ex2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleFileClient {
    public final static int SOCKET_PORT = 13267;      // you may change this
    public final static String SERVER = "127.0.0.1";  // localhost
    public final static String
            FILE_TO_RECEIVED = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/two.txt";  // you may change this, I give a
    // different name because i don't want to
    // overwrite the one used by server...
    public final static int FILE_SIZE = 6022386; // file size temporary hard coded
    // should bigger than the file to be downloaded

    public static void main(String[] args) throws IOException {
        int bytesRead;
        int current;
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        Socket socket = null;
        try {
            socket = new Socket(SERVER, SOCKET_PORT);
            System.out.println("Connecting...");
            // receive file
            byte[] mybytearray = new byte[FILE_SIZE];
            InputStream inputStream = socket.getInputStream();
            fileOutputStream = new FileOutputStream(FILE_TO_RECEIVED);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bytesRead = inputStream.read(mybytearray, 0, mybytearray.length);
            current = bytesRead;
            do {
                bytesRead = inputStream.read(mybytearray, current, (mybytearray.length - current));
                if (bytesRead >= 0) current += bytesRead;
            } while (bytesRead > -1);
            bufferedOutputStream.write(mybytearray, 0, current);
            bufferedOutputStream.flush();
            System.out.println("File " + FILE_TO_RECEIVED + " downloaded (" + current + " bytes read)");
        } finally {
            if (fileOutputStream != null) fileOutputStream.close();
            if (bufferedOutputStream != null) bufferedOutputStream.close();
            if (socket != null) socket.close();
        }
    }
}
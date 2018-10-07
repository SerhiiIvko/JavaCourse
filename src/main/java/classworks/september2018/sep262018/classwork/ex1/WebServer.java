package classworks.september2018.sep262018.classwork.ex1;

import java.io.*;
import java.net.*;


public class WebServer {
    public static final int PORT = 8081;

    public static void main(String[] args) throws IOException {
//        InetAddress inetAddress = InetAddress.getByName(null);//return localhost
//        InetAddress inetAddress1 = InetAddress.getLocalHost();//return localhost
//
//        URL url = new URL("i.ua");
//
//        URLConnection urlConnection = new URLConnection(url) {
//            @Override
//            public void connect() throws IOException {
//
//            }
//        };
//
//        HttpURLConnection httpURLConnection = new HttpURLConnection(url) {
//            @Override
//            public void disconnect() {
//
//            }
//
//            @Override
//            public boolean usingProxy() {
//                return false;
//            }
//
//            @Override
//            public void connect() throws IOException {
//
//            }
//        };
//
//        ServerSocket serverSocket = new ServerSocket(1097);
//        Socket socket = serverSocket.accept();
//        InputStream inputStream = socket.getInputStream();
//        OutputStream outputStream = socket.getOutputStream();
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Started: " + serverSocket);
        try {
            Socket socket = serverSocket.accept();
            try {
                System.out.println("Connection accepted: " + socket);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
                while (true) {
                    String string = bufferedReader.readLine();
                    if (string.equals("END"))
                        break;

                    System.out.println("Enchoing " + string);
                    printWriter.println(string);
                }
            } finally {
                System.out.println("closing...");
                socket.close();
            }
        } finally {
            serverSocket.close();
        }
    }
}
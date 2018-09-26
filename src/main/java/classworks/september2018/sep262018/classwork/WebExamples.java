package classworks.september2018.sep262018.classwork;

import java.io.IOException;
import java.net.*;


public class WebExamples {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName(null);//return localhost
        InetAddress inetAddress1 = InetAddress.getLocalHost();//return localhost

        URL url = new URL("i.ua");

        URLConnection urlConnection = new URLConnection(url) {
            @Override
            public void connect() throws IOException {

            }
        };

        HttpURLConnection httpURLConnection = new HttpURLConnection(url) {
            @Override
            public void disconnect() {

            }

            @Override
            public boolean usingProxy() {
                return false;
            }

            @Override
            public void connect() throws IOException {

            }
        };

        ServerSocket serverSocket = new ServerSocket();
        Socket socket = serverSocket.accept();



    }


}
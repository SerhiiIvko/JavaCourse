package classworks.september2018.sep242018.classwork.ex1;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
//            byte data[] = {1, 2, 33};
            String string = "Test Server";
            byte data[] = string.getBytes(StandardCharsets.UTF_8);
            InetAddress inetAddress = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(data, string.length(), inetAddress, 3456);
            datagramSocket.send(packet);
            System.out.println("Datagram sent");
            System.out.println(string);
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
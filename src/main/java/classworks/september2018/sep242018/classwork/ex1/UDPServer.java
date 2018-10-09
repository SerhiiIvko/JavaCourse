package classworks.september2018.sep242018.classwork.ex1;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(3456);
            byte data[] = new byte[256];
            DatagramPacket packet = new DatagramPacket(data, 256);
            System.out.println("Waiting...");
            datagramSocket.receive(packet);
//            System.out.println("Datagram received: " + data[0] + ", " + data[1] + ", " + data[2]);
            System.out.println(new String(data, StandardCharsets.UTF_8));
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
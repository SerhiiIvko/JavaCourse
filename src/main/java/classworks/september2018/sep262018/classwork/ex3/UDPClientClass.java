package classworks.september2018.sep262018.classwork.ex3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientClass {
    /* Объявляются переменные */
    static DatagramSocket socket;
    static InetAddress address;
    static byte[] buffer;
    static DatagramPacket packet;
    static String str, str2;
    static BufferedReader br;

    public static void main(String arg[]) throws Exception {
        /* Создается входной поток, который читается с консоли */
        br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

     /* Создается новый объект DatagramSocket и связывается с портом по умол-
     чанию */
            socket = new DatagramSocket();
            address = InetAddress.getByName("127.0.1.1");
            buffer = new byte[256];
            packet = new DatagramPacket(buffer, buffer.length, address, 1501);
            /* Посылается DatagramPacket на сервер */
            socket.send(packet);
            System.out.println("Sending request ");
            packet = new DatagramPacket(buffer, buffer.length);
            /* Принимается DatagramPacket от сервера */
            socket.receive(packet);
            /* Принимаются данные от объекта пакета датаграмм и*/
            str = new String(packet.getData());
            System.out.println("Received message : " + str.trim());
            System.out.println("Do you want continue (Yes/No) : ");
            str2 = br.readLine();
            /* Выход из цикла while */
            if (str2.equals("No")) {
                break;
            }
        }
        /* Закрывается объект сокет */
        socket.close();
    }
}
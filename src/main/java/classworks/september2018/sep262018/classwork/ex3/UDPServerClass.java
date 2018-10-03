package classworks.september2018.sep262018.classwork.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServerClass {
    /* Объявляются переменные */
    DatagramSocket socket = null;
    BufferedReader in = null;
    String str = null;
    byte[] buffer;
    DatagramPacket packet;
    InetAddress address;
    int port;

    /* Конструктор класса UDPServerClass */
    public UDPServerClass() throws IOException {
        /* Создается объект DatagramSocket, который получает запросы клиента на номер порта 1501 */
        socket = new DatagramSocket(1501);
        /* Вызывается метод call()*/
        call();
    }

    public void call() {
        System.out.println("Request string for sending to client ");
        try {
            while (true) {
                buffer = new byte[256];
                /* Инициализируется объект DatagramPacket */
                packet = new DatagramPacket(buffer, buffer.length);
                /* Посылается пакет датаграмм, используя метод receive() класса DatagramSocket */
                socket.receive(packet);
                if (packet == null) {
                    break;
                }
                try {
                    /*Создается входной поток, который считывает данные с консо-ли*/
                    in = new BufferedReader(new InputStreamReader(System.in));

                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }
                str = in.readLine();
                buffer = str.getBytes();
                address = packet.getAddress();
                port = packet.getPort();
                packet = new DatagramPacket(buffer, buffer.length, address, port);
                /* Посылается датаграммный пакет */
                socket.send(packet);
            }
            /* Закрывается поток и сокет */
            in.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public static void main(String args[]) throws Exception {
        /* Запускается сервер */
        new UDPServerClass();
    }
}
package classworks.october2018.oct032018.classwork.task1;

import classworks.september2018.sep262018.classwork.ex4.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerCommandListener {
    private BufferedReader inputReader = null;
    private String string = null;
    private byte[] buffer;
    private DatagramPacket packet;
    private InetAddress address;
    private DatagramSocket socket;

    public ServerCommandListener() throws IOException {
        System.out.println("Sending messages");
        // Создается объект DatagramSocket для приема запросов клиента
        socket = new DatagramSocket();
        // Вызов метода transmit() для передачи сообщение всем клиентам, зарегистрированным в группе
        transmit();
    }

    public void transmit() {
        try {
            // создается входной поток для приема данных с консоли
            inputReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Введите строку для передачи клиентам: ");
                string = inputReader.readLine();
                buffer = string.getBytes();
                address = InetAddress.getByName("233.0.0.1");
                // Посылка пакета датаграмм на порт номер 1502
                packet = new DatagramPacket(buffer, buffer.length, address, 1502);
                // Посылка сообщений всем клиентам в группе
                socket.send(packet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Закрытие потока и сокета
                inputReader.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String arg[]) throws Exception {
        // Запуск сервера
        new Server();
    }
}
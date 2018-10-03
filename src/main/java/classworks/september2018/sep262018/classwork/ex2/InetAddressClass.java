package classworks.september2018.sep262018.classwork.ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;

class InetAddressClass {
    public static void main(String arg[]) {
        try {
            /*
             * Создается объект InetAddress, используя getLocalHost()
             * статический метод класса InetAddress
             */
            InetAddress address = InetAddress.getLocalHost();
            /* Получение IP адреса хоста */
            String addressHost = address.getHostAddress();
            /* Вывод IP адреса хоста */
            System.out.println("Вывод IP адреса хоста: " + addressHost);
            // Вывод имени хоста
            System.out.println("Вывод имени хоста: " + address.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("Error");
        }
    }
}
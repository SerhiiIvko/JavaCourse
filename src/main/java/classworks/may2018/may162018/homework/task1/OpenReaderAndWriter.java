package classworks.may2018.may162018.homework.task1;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.Scanner;

/**
 * Напишите класс, реализующий интерфейс Runnable, метод run() которого считывает из файла на жестком диске и выводит в
 * указанный поток какие-либо данные.
 * Для вывода каждой "порции" данных должно использоваться несколько операций вывода. Операции вывода должны быть разделены
 * вызовами sleep(100).
 * Запустите 10 экземпляров этого класса в разных потоках так, чтобы они выводили данные в один и тот же поток вывода.
 * Вывод информации должен быть синхронизирован так, чтобы в результирующем выходном потоке порции данных не "перемешивались".
 * Осуществите запись данных из общего потока в отдельный файл на жестком диске (или в самом проекте, как мы делали).
 */
public class OpenReaderAndWriter implements Runnable {
    private FileChannel channel;
    private FileChannel writeChannel;
    private int startLocation;
    private int size;

    public OpenReaderAndWriter(int loc, int sz, FileChannel chnl, FileChannel write) {
        startLocation = loc;
        size = sz;
        channel = chnl;
        writeChannel = write;
    }

    public void run() {
        try {
            System.out.println("Reading the channel: " + startLocation + ":" + size);
            ByteBuffer buff = ByteBuffer.allocate(size);
            if (startLocation == 0) {
                Thread.sleep(100);
            }
            channel.read(buff, startLocation);
            ByteBuffer wbuff = ByteBuffer.wrap(buff.array());
            int written = writeChannel.write(wbuff, startLocation);
            System.out.println("Read the channel: " + buff + ":" + new String(buff.array()) + ":Written:" + written);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
            throws Exception {
        FileInputStream str = new FileInputStream("happy.txt");
        FileOutputStream ostr = new FileOutputStream("new_happy.txt");
        Scanner scanner = new Scanner(str);
        String b = scanner.nextLine();
        FileChannel chnl = str.getChannel();
        FileChannel write = ostr.getChannel();
        ByteBuffer buff = ByteBuffer.wrap(b.getBytes());
        write.write(buff);
        Thread t[] = new Thread[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new OpenReaderAndWriter(i * 1000, 2250, chnl, write));
            System.out.println("Thread " + (i + 1) + " created");
            t[i].setPriority(Thread.MIN_PRIORITY + i);
        }
        System.out.println();
        for (int i = 0; i < t.length; i++) {
            Thread thread = t[i];
            System.out.println("Thread " + (i + 1) + " started");
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + (i + 1) + " finished");
        }
        write.force(true);
        str.close();
        ostr.close();
    }
}
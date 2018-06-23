package classworks.may2018.may212018.homework.task1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/**
 * Создать программу для загрузки файлов из сети интернет.
 * Реализовать работу в многопоточном режиме (одновременная загрузка до 5 файлов).
 * По окончании загрузки вывести информацию о загрузке (где был сохранен файл, его имя, размер файла).
 * Для загрузки файлов использовать класс URL
 */
public class Downloader {
    public static void main(String[] args) throws MalformedURLException {
        List<URL> urls = new ArrayList<>();
        urls.add(new URL("http://www.helloworld.ru/texts/comp/lang/java/java/01.htm"));
        urls.add(new URL("http://www.helloworld.ru/texts/comp/lang/java/java/02.htm"));
        urls.add(new URL("http://www.helloworld.ru/texts/comp/lang/java/java/03.htm"));
        urls.add(new URL("http://www.helloworld.ru/texts/comp/lang/java/java/04.htm"));
        urls.add(new URL("http://www.helloworld.ru/texts/comp/lang/java/java/05.htm"));
        List<File> destinations = new ArrayList<>();
        destinations.add(new File("/home/ivko/Загрузки/java_folder/file.htm"));
        destinations.add(new File("/home/ivko/Загрузки/java_folder/file1.htm"));
        destinations.add(new File("/home/ivko/Загрузки/java_folder/file2.htm"));
        destinations.add(new File("/home/ivko/Загрузки/java_folder/file3.htm"));
        destinations.add(new File("/home/ivko/Загрузки/java_folder/file4.htm"));
        List<File> files = new ArrayList<>();
        Thread t[] = new Thread[5];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new FileDownloader(urls.get(i).toString(), destinations.get(i)));
            files.add(i, destinations.get(i));
        }
        System.out.println();
        for (int i = 0; i < t.length; i++) {
            System.out.println("Thread " + (i + 1) + " started, file downloading...");
            Thread thread = t[i];
            System.out.println("File name: "
                    + files.get(i).getName()
                    + "\nFile downloaded to location: "
                    + files.get(i).getParent()
                    + "\nFile space: "
                    + files.get(i).length()
                    + " bytes");
            thread.start();
        }
    }
}
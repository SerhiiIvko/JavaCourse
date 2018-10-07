package classworks.october2018.oct032018.classwork.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

//1. Получить список файлов в директории сервера (метод)
//2. Получить файл из этого списка, сохранив его в указанное место (метод)

public class HttpDownloadUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String LIST_COMMAND = "list";
    private static final String GET_COMMAND = "get";
    private static final String EXIT_COMMAND = "exit";

    public static void getCommand(String command) {
        InputStream inputStream = System.in;
//        command = inputStream.read();
    }

    public static void showFilesInDirectory(String directoryPath) {
        File file = new File(directoryPath);
        ArrayList<String> files = new ArrayList<>(Arrays.asList(file.list()));
        StringBuilder builder = new StringBuilder();
        for (String file1 : files) builder = builder.append(file1).append("\n");
        System.out.println(builder);
    }

    public static void downloadFile(String fileURL, String saveDir) throws IOException {
        URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();

        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String fileName = "";
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();

            if (disposition != null) {
                // extracts file name from header field
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                            disposition.length() - 1);
                }
            } else {
                // extracts file name from URL
                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1, fileURL.length());
            }

            System.out.println("Content-Type = " + contentType);
            System.out.println("Content-Disposition = " + disposition);
            System.out.println("Content-Length = " + contentLength);
            System.out.println("fileName = " + fileName);

            // opens input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = saveDir + File.separator + fileName;

            // opens an output stream to save into file
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);

            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();

            System.out.println("File downloaded");
        } else {
            System.out.println("No file to download. Server replied HTTP code: " + responseCode);
        }
        httpConn.disconnect();
    }
}
package classworks.october2018.oct032018.classwork.task1;

import java.io.IOException;

public class HttpDownloader {
    public static void main(String[] args) throws IOException {
        String fileURL = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list/one.txt";
        String directoryURL = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/list";
        String saveDir = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources";

        HttpDownloadUtility.showFilesInDirectory(directoryURL);
//        HttpDownloadUtility.downloadFile(fileURL, saveDir);
    }
}
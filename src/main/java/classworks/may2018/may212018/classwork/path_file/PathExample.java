package classworks.may2018.may212018.classwork.path_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("test.txt");
        System.out.println("Path : " + pathToFile);
        Path absolutePath = pathToFile.toAbsolutePath();
        System.out.println("Абсолютный путь : " + absolutePath);
        //System.out.println("Реальный путь : "+ pathToFile.toRealPath());
        //windows \
        //unix /
        Path pathToFile1 = Paths.get("folder1", "test.txt");
        Path pathToFile2 = Paths.get("folder2", "test.txt");
        System.out.println("Path 1 : " + pathToFile1);
        System.out.println("Path 2: " + pathToFile2);

        Path absolutePath1 = pathToFile1.toAbsolutePath();
        Path absolutePath2 = pathToFile2.toAbsolutePath();
        System.out.println("Абсолютный путь1 : " + absolutePath1);
        System.out.println("Абсолютный путь2 : " + absolutePath2);

        //./ - текущя директория
        //../- предыдущая директория

        Path path = Paths.get("folder\\..\\folder2\\.\\test.txt");
        System.out.println("some path " + path);
        System.out.println("some path " + path.normalize());

        //получить путь к файлам относительно другого пути
        Path folder1 = Paths.get("folder1");
        System.out.println("relative " + folder1.relativize(pathToFile2));

        //обьединение нескольких путей
        System.out.println("путь к test.txt" + folder1.resolve("test.txt"));

        //вывод отдельных сегментов пути
        //getNameCount
        for (int i = 0; i < absolutePath.getNameCount(); i++) {

            System.out.println("#" + i + " " + absolutePath.getName(i));

        }
        System.out.println("==============================================");

        //получить корневой каталог относительно текущго пути
        System.out.println("Корневой каталог пути : " + absolutePath.getRoot());
        System.out.println("Корневой каталог пути : " + folder1.getRoot());

        //получить родительский элемент относительно текущего пути
        System.out.println("Родитель, абсолютный путь " + absolutePath.getParent());
        System.out.println("Родитель, релятивного пути " + folder1.getParent());

        //Проверка Файл или Директория
        //Files

        //проверить является ли этот путь файлом
        System.out.println("Проверка на Файл : " + Files.isRegularFile(folder1));
        System.out.println("Проверка на Директорию : " + Files.isDirectory(folder1));

        //Удаление с обязательной проверкой

        if (Files.isRegularFile(pathToFile1)) {
            Files.delete(pathToFile1);
        } else
            System.out.println("Файл уже удален");

        //удаление файла без проверки
        Files.deleteIfExists(pathToFile2);

        //Копирование файла или Директории
        //Files.copy(folder1, Paths.get("folder3"));
        Path folder3 = Paths.get("folder3");
        if (!Files.isDirectory(folder3)) {
            Files.copy(folder1, folder3);
        }

        //Перемещение файла или директории
        //Files.move(folder3,Paths.get("folder"));

        Path path1 = Paths.get("folder");
        if (!Files.exists(path1)) {
            Files.move(folder3, path1);
        }

        //Атрибуты файла

        System.out.println("Атрибуты для : " + pathToFile1);
        if (!Files.exists(pathToFile1)) {
            Files.createFile(pathToFile1);
        }

        BasicFileAttributes attr = Files.readAttributes(pathToFile1, BasicFileAttributes.class);

        System.out.println("Время создания файла " + attr.creationTime());
        System.out.println("Время последнего изменения " + attr.lastModifiedTime());
        System.out.println("Время доступа " + attr.lastAccessTime());

        //Чтение запись файла
        //работает только при небольшом размере файла
        Path pathTest = Paths.get("test.txt");
        System.out.println("Размер файла : " + Files.size(pathTest));
        Files.readAllLines(pathTest).stream()
                .forEach(System.out::println);


        //универсальный способ чтения
        BufferedReader reader = Files.newBufferedReader(pathTest);
        System.out.println(reader.readLine());
        reader.close();

        //Walking File tree

//        Files.walkFileTree(Paths.get("."), new FileVisitor<Path>() {
//
//            @Override//нужен для ограничения посещения определенных файлов
//            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//                if(dir.endsWith("com")){
//                    return FileVisitResult.TERMINATE;
//                }
//                System.out.println(">>>> preVisitor Directory " + dir);
//                return FileVisitResult.CONTINUE;
//            }
//
//            @Override
//            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                System.out.println("Visitor file " + file);
//                return FileVisitResult.CONTINUE;
//            }
//
//            @Override//если файл не возможно прочитать по каки-то причинам(флешка)
//            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
//                return FileVisitResult.CONTINUE;
//            }
//
//            @Override//сработает как только мы вышли из директории
//            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//                System.out.println("<<<< postVisitor Directory " + dir);
//                return FileVisitResult.CONTINUE;
//            }
//        });

        //Поиск файлов и директорий
        Files.find(Paths.get("."), 256, (path2, basicFileAttributes) -> path2.getFileName()
                .toString()
                .endsWith(".java"))
                .forEach(System.out::println);
    }
}
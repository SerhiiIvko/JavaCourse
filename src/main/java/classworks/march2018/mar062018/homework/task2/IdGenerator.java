package classworks.march2018.mar062018.homework.task2;

public class IdGenerator {
    private static int currentId = 1;

    public static int getNextId() {
        return currentId++;
    }
}
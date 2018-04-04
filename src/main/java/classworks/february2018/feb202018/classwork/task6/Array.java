package classworks.february2018.feb202018.classwork.task6;

public class Array {
    static int values[];

    static void printArray(int i) {

        if (i == 0) {
            return;
        } else {
            System.out.println("[" + (i - 1) + "]" + values[i - 1]);
            printArray(i - 1);
            System.out.println("[" + (i - 1) + "]" + values[i - 1]);
        }

    }

    public static void main(String[] args) {
        int num = 5;
        values = new int[num];
        int j;
        for (j = 0; j < num; j++) {
            values[j] = j;
        }
        printArray(num);
    }
}
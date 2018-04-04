package classworks.march2018.mar272018.homework.task;

public class Array {

    public int[] createArray(int capacity) {
        return new int[capacity];
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getSumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int getDifferenceElements(int[] array) {
        int difference = array[0];
        for (int i = 0; i < array.length; i++) {
            difference -= array[i];
        }
        return difference;
    }

    public long getMultiplyElements(int[] array) {
        int multiply = array[0];
        for (int i = 0; i < array.length; i++) {
            multiply *= array[i];
        }
        return multiply;
    }
}
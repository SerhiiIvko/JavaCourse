package classworks.feb062018.task2;

public class AlgoSearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 2, 1, 3, 4};

        int num = 9;
        int count;

        for (count = 0; count < arr.length; count++) {
            if (arr[count] == num) {
                System.out.println("number " + num + " in array stay on " + (count + 1) + " place");
                break;
            }
        }
        if (count == arr.length) {
            System.out.println("Number is not found");
        }
    }
}

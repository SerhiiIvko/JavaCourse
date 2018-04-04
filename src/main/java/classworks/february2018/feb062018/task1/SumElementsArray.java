package classworks.february2018.feb062018.task1;

//Find sum of elements array
public class SumElementsArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 10, 6};
        int sum = 0;
        for (int anArr : arr) {
            sum += anArr;
        }
        System.out.println(sum);
    }
}
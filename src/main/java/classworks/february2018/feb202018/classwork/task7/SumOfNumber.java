package classworks.february2018.feb202018.classwork.task7;

public class SumOfNumber {

    public static String estimate(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            String c = string.substring(i, i + 1);
            sum += Integer.parseInt(c);
        }
        String newStr = String.valueOf(sum);
        if (newStr.length() > 1) {
            newStr = estimate(newStr);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(estimate("555"));
    }
}
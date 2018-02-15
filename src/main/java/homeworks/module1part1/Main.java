package homeworks.module1part1;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("333");
        boolean isPalindrom = false;
        if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
            isPalindrom = true;
        }
        System.out.println(isPalindrom);
    }
}
package homeworks;

/**
 * Created by ivko on 22.02.18.
 */
public class FindSeven {
    public static int count7(int n) {
        int count = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 7) {
            return 1;
        } else if (n % 10 == 7) {
            count++;
        }
        return count + count7(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(count7(333777));
    }
}

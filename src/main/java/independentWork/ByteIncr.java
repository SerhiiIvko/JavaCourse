package independentWork;

/**
 * Created by ivko on 29.05.18.
 */
public class ByteIncr {
    public static void main(String[] args) {
//        for (byte i = 127; i < 128; i++) {
//            System.out.println(i);
//        }
//        byte b = 127;
//        b = b+1;
//        System.out.println(b);
        System.out.println(getSum(9, 1));
        ByteIncr byteIncr = new ByteIncr();
        System.out.println(byteIncr.toString());
    }

    static int getSum(int a, int b) {
        return a > 0 ? a + b : a - b;
    }
}
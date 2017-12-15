package independentWork.loops.task6;

/**
 * Created by ivko on 14.12.17.
 */
public class MirrorNumber {
    public static void main(String[] args) {
        int a = 12;
        int mirror = 0;
        int tmp;
        while (a != 0) {
            tmp = a % 10;
            mirror = mirror * 10 + tmp;
            a = a / 10;
        }
        System.out.println(mirror);
    }
}

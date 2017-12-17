package independentWork.work1.methods;

/**
 * Created by ivko on 13.12.17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.err.print("**********\n|  ");
            System.err.flush();
            Thread.sleep(50);
            System.out.print("text");
            System.out.flush();
            Thread.sleep(50);
            System.err.print("  |\n**********");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

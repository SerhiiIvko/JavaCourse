package homeworks;

public class StrangeLoop {
    public static void main(String[] args) {
        System.out.println(get());
    }

    private static int get() {
        int i = 0;
        try {
            i = 2;
            return i;
        } finally {
            i = 12;
            System.out.println("finally trumps return." + i);
        }

    }
}
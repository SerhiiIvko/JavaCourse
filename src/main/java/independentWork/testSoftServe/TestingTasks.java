package independentWork.testSoftServe;

public class TestingTasks {
    public static void main(String[] args) {
        char a = 064770;//+
//        char b = 'face';
        char c = 0xbeef;//+
//        char d = \u0022;
//        char e = '\iface';
        char f = '\uface';//+

        int mylist1[] = {1, 2, 3, 4, 5};

        System.out.println(a + " " + c + " " + f);
        try {
            int x = 0;
            int y = 5 / x;
        } catch (Exception e) {
            System.out.println("Exception");
        }
//        catch (ArithmeticException ae){
//            System.out.println("A E");
//        }
        System.out.println("default");
    }
}

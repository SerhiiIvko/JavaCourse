package classworks.february2018.feb152018.classwork.task4;

public class A {
    private static String globalVisible = "Global visible";

    public static void main(String[] args) {
        System.out.println();
        String global = "Global variable";
        System.out.println(global);
        {
            String local = "Local variable";
            System.out.println(local.concat(global));
        }
        System.out.println(globalVisible);

        //A2.method1();
//        A2.method3();
        A2.method4();
    }
}
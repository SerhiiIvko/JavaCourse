package JavaScriptCourse.sep19_2018.homework;

public class Main {
    public static void main(String[] args) {
        String test = "string";
        boolean result;
        int num = 7;
        Integer number = 9;
        result = test instanceof String;
        System.out.println(result);

        result = test instanceof Object;
        System.out.println(result);

        result = (Integer) num instanceof Integer;
        System.out.println(result);
        byte t = 6;
        byte f = 4;
        short a = 1;
        short b = 3;
        short c = (short) (a + b);
        byte res = (byte) (f + t);
        System.out.println(res);
        System.out.println(c);
//        int number = 99;
//        char num = (char) number;
//        System.out.println(num);

//        String str1 = "a";
//        String str2 = "a";
//        String str3 = new String("a");
//        System.out.println(str1.equals(str2));
//    static {
//        System.out.println("Hello world");
//        System.exit(0);
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);

        try{
            String string = "hey";
            System.out.println(string);
        } finally {

            System.out.println("Bye");
        }
    }
}
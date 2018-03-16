package classworks.mar062018.classwork.task3.one;

public class ErrorMsg {
    public static void main(String[] args) {
        Errors errors = new Errors();
        System.out.println(errors.getErrorMessages(5));
        System.out.println(errors.getErrorMessages(1));
        System.out.println(errors.getErrorMessages(19));
    }
}
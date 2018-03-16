package classworks.mar062018.classwork.task3.two;

public class ErrorMessageRunner {
    public static void main(String[] args) {
        Messages messages = new Messages();
        ErrorMessage errorMessage;
        errorMessage = messages.getErrorMessage(2);
        System.out.println(errorMessage.errorMessages + " level " + errorMessage.severity);
        errorMessage = messages.getErrorMessage(19);
        System.out.println(errorMessage.errorMessages + " level " + errorMessage.severity);
    }
}
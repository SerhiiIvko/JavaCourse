package classworks.mar062018.classwork.task3.one;

public class Errors {
    private String[] messages = {
            "Output error!",
            "Input error",
            "Disk overflow",
            "ArrayIndexOfBoundError"
    };

    public String getErrorMessages(int indexOfMessage) {
        if (indexOfMessage >= 0 && indexOfMessage < messages.length) {
            return messages[indexOfMessage];
        } else {
            return "error not found";
        }
    }
}
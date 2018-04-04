package classworks.march2018.mar062018.classwork.task3.two;

public class Messages {
    String[] messages = {
            "Output error!",
            "Input error",
            "Disk overflow",
            "ArrayIndexOfBoundError"
    };

    int[] howBad = {3, 3, 2, 4};

    ErrorMessage getErrorMessage(int index) {
        if (index >= 0 & index < messages.length) {
            return new ErrorMessage(messages[index], howBad[index]);
        } else {
            return new ErrorMessage("This error not found!", 0);
        }
    }
}
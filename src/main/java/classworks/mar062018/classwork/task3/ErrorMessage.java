package classworks.mar062018.classwork.task3;

public class ErrorMessage {


    String[] msgs = {"Output error!",
            "Input error",
            "Disk overflow",
            "ArrayIndexOfBoundError"};

    String getErrorMessage(int i) {
        if (i >= 0 && i < msgs.length) {
            return msgs[i];
        } else {
            return "no erorr";
        }
    }
}
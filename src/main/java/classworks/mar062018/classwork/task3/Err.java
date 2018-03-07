package classworks.mar062018.classwork.task3;

/**
 * Created by ivko on 06.03.18.
 */
public class Err {
    String msg;
    int severity;
    String[] msgs = {"Output error!",
            "Input error",
            "Disk overflow",
            "ArrayIndexOfBoundError"};

    Err(String m, int s) {
        msg = m;
        severity = s;
    }

    int[] hoebed = {3, 3, 3, 4};

    Err getErrorMsg(int i) {
        if (i >= 0 && i < msgs.length) {
            return new Err(msgs[i], hoebed[i]);
        } else {
            return new Err("error not found", 0);
        }
    }

}

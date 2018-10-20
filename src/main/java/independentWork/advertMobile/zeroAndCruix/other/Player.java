package independentWork.advertMobile.zeroAndCruix.other;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {
    public static void main(String[] args) throws IOException {
        String result = "hello world!\n";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String path = "/home/ivko/IdeaProjects/JavaCourse/src/main/resources/myfile.txt";
        result = result + date.toString() + "\n";
        File myFoo = new File(path);
        FileOutputStream fooStream = new FileOutputStream(myFoo, true); // true to append
        // false to overwrite.
        byte[] myBytes = result.getBytes();
        fooStream.write(myBytes);
        fooStream.close();

//        File file = new File(path);
//
////        File myFoo = new File("foo.log");
//        FileWriter fooWriter = new FileWriter(file, false); // true to append
//        // false to overwrite.
//        fooWriter.write(result);
//        fooWriter.close();
    }
}

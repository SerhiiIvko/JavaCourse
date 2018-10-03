package classworks.september2018.sep262018.classwork.ex6;

import java.io.Serializable;
import java.util.Date;

public class DateMessage implements Serializable {
    private static final long serialVersionUID = 1848502097488780883L;
    private Date date;
    private String message;

    public DateMessage(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

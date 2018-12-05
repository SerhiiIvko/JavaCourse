package homework.servlet.tag;

import homework.model.Student;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class CustomTag extends SimpleTagSupport {
    public void doTag() throws IOException {
        Student student = new Student();
        student.setName("Ivko");
        student.setSecondName("Serhii");
        student.setSurname("Oleksandrovych");
        JspWriter out = getJspContext().getOut();
        out.println(student.toString());
    }
}
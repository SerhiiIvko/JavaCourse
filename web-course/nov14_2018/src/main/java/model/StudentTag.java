//package model;
//
//import javax.servlet.jsp.JspException;
//import javax.servlet.jsp.JspWriter;
//import javax.servlet.jsp.tagext.SimpleTagSupport;
//import java.io.IOException;
//
//public class StudentTag extends SimpleTagSupport {
//    Student student;
//
//    public void doTag() throws JspException, IOException {
//        student = new Student();
//        JspWriter out = getJspContext().getOut();
//        out.println(student.toString());
//    }
//}
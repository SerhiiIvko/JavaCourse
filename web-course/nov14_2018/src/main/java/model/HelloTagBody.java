//package model;
//
//import javax.servlet.jsp.JspException;
//import javax.servlet.jsp.JspWriter;
//import javax.servlet.jsp.tagext.SimpleTagSupport;
//import java.io.IOException;
//import java.io.StringWriter;
//
//public class HelloTagBody extends SimpleTagSupport {
//    private String studentData;
//    private String name;
//    private String secondName;
//    private String surname;
//
//    public void setStudentData(String msg) {
//        this.studentData = msg;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setSecondName(String secondName){
//        this.secondName = secondName;
//    }
//
//    public void setSurname(String surname){
//        this.surname = surname;
//    }
//
//    public void doTag() throws JspException, IOException {
//        StringWriter sw = new StringWriter();
//        if (studentData != null) {
//            /* Use studentData from attribute */
//            JspWriter out = getJspContext().getOut();
//            out.println(name + " " + secondName + " " + surname);
//        } else {
//            /* use studentData from the body */
//            getJspBody().invoke(sw);
//            getJspContext().getOut().println(sw.toString());
//        }
//    }
//}
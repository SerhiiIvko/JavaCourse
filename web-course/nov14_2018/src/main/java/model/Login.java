package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String un = request.getParameter("uname");
        String pw = request.getParameter("pass");

        PrintWriter out = response.getWriter();
        Cookie ck = new Cookie("auth", un);
        ck.setMaxAge(60);
        response.addCookie(ck);
        response.sendRedirect("home.jsp");
        if (un == null || pw == null) {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            out.println("Either user name or password is wrong.");
            rd.include(request, response);
        }

//        if (un.equals("candidjava") & pw.equals("candidjava")) {
//            response.addCookie(ck);
//            response.sendRedirect("home.jsp");
//        } else {
//
//        }
    }
}
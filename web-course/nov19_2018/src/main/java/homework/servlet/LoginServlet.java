package homework.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        if (!username.isEmpty() && !password.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            session.setMaxInactiveInterval(60 * 5);
            Cookie thisUser = new Cookie("thisUser", username);
            thisUser.setMaxAge(60 * 5);
            response.addCookie(thisUser);
            response.sendRedirect("addVeggies.jsp");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either username or password is wrong or empty! Try again!</font>");
        }
    }
}
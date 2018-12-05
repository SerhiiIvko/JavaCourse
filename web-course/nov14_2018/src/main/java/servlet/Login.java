package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Создать две странички
//Ввода имени и приветствия
//после ввода имени на страничке приветствия отображается имя
//при последующих попытках попасть на страницу ввода имени вы попадаете на страницу приветствия
//сделать с помощью Куки

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        if (!username.isEmpty() && !password.isEmpty()) {
            Cookie message = new Cookie("message", username);
            message.setMaxAge(30);
            response.addCookie(message);
            response.sendRedirect("LoginSuccess.jsp");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either username or password is wrong or empty! Try again!</font>");
        }
    }
}
package homework.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
    private static final long serialVersionUID = -2521173992038119543L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productName = request.getParameter("product");
        String price = request.getParameter("price");
        String quantity = request.getParameter("quantity");
        if (!productName.isEmpty() && !price.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("product", productName);
            session.setAttribute("price", price);
            session.setAttribute("quantity", quantity);
            response.sendRedirect("basket.jsp");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either username or password is wrong or empty! Try again!</font>");
        }
    }
}
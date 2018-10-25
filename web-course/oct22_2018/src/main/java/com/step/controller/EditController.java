package com.step.controller;

import com.step.model.EditPerson;
import com.step.model.EditPersonDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "EditController",
        urlPatterns = "/EditController"
)
public class EditController extends HttpServlet {
    private static final long serialVersionUID = -6151518835003754425L;
    private final String SUCCESS_MSG = "User was successfully updated!";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("btn_edit") != null) {
            String name_up = request.getParameter("txt_name");
            String email_up = request.getParameter("txt_email");
            String password_up = request.getParameter("txt_password");
            int id = Integer.parseInt(request.getParameter("hidden_id"));
            EditPerson editPerson = new EditPerson();
            editPerson.setName(name_up);
            editPerson.setEmail(email_up);
            editPerson.setPassword(password_up);
            editPerson.setId(id);
            EditPersonDao editDao = new EditPersonDao();
            String updateValidate = editDao.checkUpdate(editPerson);
            if (updateValidate.equals(SUCCESS_MSG)) {
                request.setAttribute("UpdateSuccessMsg", updateValidate);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("UpdateErrorMsg", updateValidate);
                RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
                rd.include(request, response);
            }
        }
    }
}
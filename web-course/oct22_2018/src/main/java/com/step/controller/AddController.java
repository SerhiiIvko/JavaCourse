package com.step.controller;

import com.step.model.AddPerson;
import com.step.model.AddPersonDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AddController",
        urlPatterns = "/AddController"
)
public class AddController extends HttpServlet {
    private static final long serialVersionUID = 3593613097082669807L;
    private final String SUCCESS_MSG = "User was successfully added!";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("btn_add") != null) {
            String name = request.getParameter("txt_name");
            String email = request.getParameter("txt_email");
            String password = request.getParameter("txt_password");
            AddPerson addPerson = new AddPerson();
            addPerson.setName(name);
            addPerson.setEmail(email);
            addPerson.setPassword(password);
            AddPersonDao addPersonDao = new AddPersonDao();
            String insertValidate = addPersonDao.checkInsert(addPerson);
            if (insertValidate.equals(SUCCESS_MSG)) {
                request.setAttribute("InsertSuccessMsg", insertValidate);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("InsertErrorMsg", insertValidate);
                RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
                rd.include(request, response);
            }
        }
    }
}
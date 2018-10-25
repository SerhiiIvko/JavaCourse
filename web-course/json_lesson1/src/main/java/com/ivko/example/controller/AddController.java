package com.ivko.example.controller;

import com.ivko.example.bean.AddBean;
import com.ivko.example.dao.AddDao;

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
    private static final long serialVersionUID = 8514342384173267539L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btn_add") != null) //check button click event not null from add.jsp page after continue
        {
            String name = request.getParameter("txt_name"); //get textbox name "txt_name"
            String owner = request.getParameter("txt_owner"); //get textbox name "txt_owner"
            AddBean addBean = new AddBean(); //this class contain setting up all receive values from add.jsp page to seeter and getter method for application require effectively
            addBean.setName(name); //set name through addBean object
            addBean.setOwner(owner); //set owner through addBean object
            AddDao addDao = new AddDao(); //this class contain main logic to perform function calling and database operation
            String insertValidate = addDao.checkInsert(addBean); //send addBean object values into checkInsert() function in AddDao class
            if (insertValidate.equals("INSERT SUCCESS")) //check calling checkInsert() function receive string "INSERT SUCCESS" after redirect to index.jsp page and display record
            {
                request.setAttribute("InsertSuccessMsg", insertValidate); //setAttribute value is "InsertSuccessMsg" for insert successfully message
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("InsertErrorMsg", insertValidate); //setAttribute value is "InsertErrorMsg" for insert fail message
                RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
                rd.include(request, response);
            }
        }
    }
}
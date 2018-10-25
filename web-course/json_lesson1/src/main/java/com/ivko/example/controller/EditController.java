package com.ivko.example.controller;

import com.ivko.example.bean.EditBean;
import com.ivko.example.dao.EditDao;

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
    private static final long serialVersionUID = 343702506833289328L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btn_edit") != null) //check button click event not null form edit.jsp page after continue
        {
            String name_up = request.getParameter("txt_name"); //get textbox name "txt_name"
            String owner_up = request.getParameter("txt_owner"); //get textbox name "txt_owner"
            int hidden_id = Integer.parseInt(request.getParameter("hidden_id")); //get hidden id name "hidden_id"
            EditBean editBean = new EditBean(); //this class contain setting up all receive values from edit.jsp page to seeter and getter method for application require effectively
            editBean.setName_UP(name_up);
            editBean.setOwner_UP(owner_up);    //set all value through editBean object
            editBean.setHidden_ID(hidden_id);
            EditDao editDao = new EditDao(); //this class contain main logic to perform function calling and database operation
            String updateValidate = editDao.checkUpdate(editBean); //send editBean object values into checkUpdate() function in EditDao class
            if (updateValidate.equals("UPDATE SUCCESS")) //check calling checkUpdate() function receive string "UPDATE SUCCESS" after redirect to index.jsp page and display update record
            {
                request.setAttribute("UpdateSuccessMsg", updateValidate); //setAttribute value is "UpdateSuccessMsg" for update successfully message
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("UpdateErrorMsg", updateValidate); //setAttribute value is "UpdateErrorMsg" for update fail message
                RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
                rd.include(request, response);
            }
        }
    }
}
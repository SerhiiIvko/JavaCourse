package com;

import com.model.TourSelect;
import com.model.TourType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "SelectTourServlet",
        urlPatterns = "/SelectTour"
)
public class SelectTourServlet extends HttpServlet {
    private static final long serialVersionUID = -5108765913097433687L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tourType = req.getParameter("Type");
        TourSelect tourSelect = new TourSelect();
        TourType type = TourType.valueOf(tourType);
        List tours = tourSelect.getAvailableTours(type);
        req.setAttribute("types", tours);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}
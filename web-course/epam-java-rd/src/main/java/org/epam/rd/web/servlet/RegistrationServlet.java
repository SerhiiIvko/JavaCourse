package org.epam.rd.web.servlet;

import org.apache.commons.lang3.StringUtils;
import org.epam.rd.service.UserService;
import org.epam.rd.service.UserServiceImpl;
import org.epam.rd.web.dto.AppUserCreateDto;
import org.epam.rd.web.dto.AppUserViewDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "registrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AppUserCreateDto appUserCreateDto = extractUserFromRequest(req);
        AppUserViewDto user = userService.registerUser(appUserCreateDto);
        HttpSession session = req.getSession(true);
        session.setAttribute("user", user);
        resp.sendRedirect("/index.jsp");
    }

    private AppUserCreateDto extractUserFromRequest(HttpServletRequest req) {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String ageParam = req.getParameter("age");
        Integer age = null;
        if (StringUtils.isNotEmpty(ageParam)) {
            age = Integer.valueOf(ageParam);
        }
        return new AppUserCreateDto(name, surname, age, email, password);
    }
}

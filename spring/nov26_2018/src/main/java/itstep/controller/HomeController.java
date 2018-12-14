package itstep.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import itstep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    public ModelAndView test(Model model) throws IOException {
        return new ModelAndView("home").addObject("users", userService.getAllUser());
    }
}

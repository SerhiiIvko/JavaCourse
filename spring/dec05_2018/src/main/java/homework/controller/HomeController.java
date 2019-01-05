package homework.controller;

import homework.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class HomeController {

    @Autowired
    RobotService robotService;

    @RequestMapping(value = "/")
    public ModelAndView test(Model model) throws IOException {
        return new ModelAndView("home").addObject("robots", robotService.getAllRobots());
    }
}
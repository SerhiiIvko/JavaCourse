package controller;

import model.Robot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoboController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String generateHomePage(Model model){

        return "index";
    }

    @RequestMapping(value = "/robot", method = RequestMethod.POST)
    public String getRobot(Robot robot, Model model){
        model.addAttribute(robot.getName());
        return "robot";
    }
}
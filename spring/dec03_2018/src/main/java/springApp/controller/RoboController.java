package springApp.controller;

import org.springframework.validation.annotation.Validated;
import springApp.model.Robot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class RoboController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("time", formattedDate);
        return "home";
    }

    @RequestMapping(value = "/robot", method = RequestMethod.POST)
    public String robot(@Validated Robot robot, Model model) {
        model.addAttribute("name", robot.getName());
        model.addAttribute("greeting", robot.getGreeting());
        return "robot";
    }
}
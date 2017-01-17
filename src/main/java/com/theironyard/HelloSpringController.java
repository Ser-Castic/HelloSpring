package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class HelloSpringController {
    @RequestMapping(path = "/person", method = RequestMethod.GET)
    public String person(Model model, String name, String city, Integer age) {
        Person p = new Person(name, city, age);
        model.addAttribute("person", p);
        return "person";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) {
        model.addAttribute("name", session.getAttribute("userName"));
        return "home";
    }
}

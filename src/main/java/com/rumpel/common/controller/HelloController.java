package com.rumpel.common.controller;

import com.rumpel.common.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

@Controller
@RequestMapping("/welcome")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) throws SQLException {

        UserService userService = new UserService();
        model.addAttribute("message1", userService.getNameById(29));
        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "hello";

    }
}

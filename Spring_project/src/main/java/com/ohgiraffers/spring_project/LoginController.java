package com.ohgiraffers.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (authService.authenticate(username, password)) {
//            return "redirect:/page/subpage";
            return "redirect:/";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index";
        }
    }
}
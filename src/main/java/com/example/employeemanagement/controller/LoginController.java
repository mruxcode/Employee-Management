package com.example.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.employeemanagement.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showWelcomePage() {
        return "index";
    }
    

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        if(userService.validateUser(username, password)){
            model.addAttribute("username", username);
            return "redirect:/employee-list";
        }else{
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}

package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("name", "Tatin Cellez");
        model.addAttribute("color", "Blue");
        model.addAttribute("Description", "I'm learning Spring Boot and Thymeleaf!");

        return "profile";
    }
}

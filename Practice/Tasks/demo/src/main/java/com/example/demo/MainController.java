package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @PostMapping("/contact")
    public String submitForm(Model model) {
        model.addAttribute("Succesfully", "Thank you");
        return "contact";
    }
}

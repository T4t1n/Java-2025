package forms.web;

import forms.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("ContactForm", new ContactForm());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitForm(@ModelAttribute ContactForm contactForm, Model model) {
        model.addAttribute("contactForm", contactForm);
        return "result";
    }

}

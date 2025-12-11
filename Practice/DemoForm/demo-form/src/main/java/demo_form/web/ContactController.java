package demo_form.web;

import demo_form.ContactForm;
import demo_form.data.ContactFormRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    private final ContactFormRepository contactFormRepository;
    public ContactController(ContactFormRepository contactFormRepository) {
        this.contactFormRepository = contactFormRepository;
    }

    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitForm(@Valid @ModelAttribute ContactForm contactForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "contact";
        }
        model.addAttribute("contactForm", contactForm);
        contactFormRepository.save(contactForm);
        return "contact";
    }
}

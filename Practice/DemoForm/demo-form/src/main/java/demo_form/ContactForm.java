package demo_form;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;


@Entity
public class ContactForm {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message = "*Name is required")
    private String name;

    @Email(message = "*Must be a valid email")
    @NotBlank(message = "*Email is requerid")
    private String email;

    @Size(min = 10, message = "*Message must be at leat 10 characters long")
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

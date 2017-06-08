package hello;

import model.Person;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/person")
    public Person getPerson() {
        return new Person().setFirstName("Daryl").setLastName("Handley");
    }
    
}

package lt.bit.registration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")

public class RegisterFormController {

    @GetMapping
    public String index() {
        return "register";
    }
}

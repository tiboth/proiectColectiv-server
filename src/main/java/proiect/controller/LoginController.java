package proiect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("login")
public class LoginController {

    @PostMapping
    boolean loginUSer() {
        return true;
    }
}

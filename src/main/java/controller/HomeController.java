package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/home")
    public String getHome() {
        return "/home";
    }
}
